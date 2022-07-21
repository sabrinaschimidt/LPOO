/* 
 * [Po]
 * implementar construtores
 * encapuslar: atributos privados e criar getters e setters
 */

import java.util.ArrayList;

public class Compras {

    @Override
    public String toString() {
        return "Compra: " + dataStr + "; " + idCompra + "; " + valor + "; ";
    }

    // atributos privados
    private String dataStr;
    private String idCompra;
    private float valor;
    // fim atributos privados

    // atributos publicos
    public Data data = new Data();
    public static ArrayList<Compras> listaCompra = new ArrayList<Compras>();
    // fim atributos publicos

    // Metodos construtore
    public Compras(String data, String idCompra, float valor) {
        this.dataStr = data;
        this.idCompra = idCompra;
        this.valor = valor;
        this.data.extrairData(dataStr);
        this.dataStr = this.data.dia + "/" + this.data.mes + "/" + this.data.ano + "/";

        Compras.listaCompra.add(this);

    }

    public Compras(String data, String idCompra, float valor, Conta conta) {
        new CompraCartaoDebito(data, idCompra, valor, conta);
    }

    public Compras(String data, String idCompra, float valor, Conta conta, int nParcelas) {
        if (nParcelas >= 1) {
            if (nParcelas == 1)
                new CompraCartaoCreditoAVista(data, idCompra, valor, conta);
            else
                new CompraCartaoCreditoParcelada(data, idCompra, valor, conta, nParcelas);

        }
    }
    // fim Metodos construtore

    // getter e setters

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static ArrayList<Compras> getListaCompra() {
        return listaCompra;
    }

    public static void setListaCompra(ArrayList<Compras> listaCompra) {
        Compras.listaCompra = listaCompra;
    }
    // fim getter e setters

}
