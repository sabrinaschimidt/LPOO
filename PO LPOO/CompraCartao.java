/* 
 * [Po]
 * implementar construtor
 * encapuslar: atributos privados e criar getters e setters
 */

public class CompraCartao extends Compras {

    @Override
    public String toString() {
        return super.toString();
    }

    // atributos privados
    private Conta conta;
    // fim atributos privados

    // construtor
    public CompraCartao(String data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor);
        this.conta = conta;
    }
    // fim construtor

    // getters e setters

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public Data getData() {
        return super.getData();
    }

    @Override
    public String getDataStr() {
        return super.getDataStr();
    }

    @Override
    public String getIdCompra() {
        return super.getIdCompra();
    }

    @Override
    public float getValor() {
        return super.getValor();
    }

    @Override
    public void setData(Data data) {
        super.setData(data);
    }

    @Override
    public void setDataStr(String dataStr) {
        super.setDataStr(dataStr);
    }

    @Override
    public void setIdCompra(String idCompra) {
        super.setIdCompra(idCompra);
    }

    @Override
    public void setValor(float valor) {
        super.setValor(valor);
    }
    // fim getters e setters

}
