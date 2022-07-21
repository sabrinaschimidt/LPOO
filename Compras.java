import java.util.ArrayList;

public class Compras extends Conta {

    // toString()
    public String toString() {
        return "Compra: " + data + "; " + idCompra + "; " + valor + "; " + nomeBanco + "; " + tpCompra;
    }

    // atributos
    private int data;
    private String idCompra;
    private float valor;
    public static ArrayList<Compras> listaCompra = new ArrayList<>();
    public Conta Conta;
    public int tipoCompra;
    public String tpCompra;

    // construtor
    public Compras(float saldo, String nomeBanco, float valor) {
        super(saldo, nomeBanco, limite);

        setValues(data, idCompra, valor);

    }

    // construtor para compra debito
    public Compras(int data, String idCompra, float valor, Conta Conta) {
        super(saldo, nomeBanco, limite);
        setValues(data, idCompra, valor);
        listaCompra.add(this);
        tipoCompra = 1;
        tipoCompra(tipoCompra);

        debitar(valor);
        // saldo = saldo - this.valor;

    }

    // construtor para compra crédito a vista e parcelado
    public Compras(int data, String idCompra, float valor, Conta Conta, int nParcelas) {
        super(saldo, nomeBanco, limite);
        setValues(data, idCompra, valor);
        listaCompra.add(this);

        if (nParcelas > 0) {
            if (nParcelas == 1)
                tpCompra = "(Credito)";
            else
                tpCompra = "(Credito) (" + nParcelas + "x)"; // adiciona a quantidade de vezes no tipo da compra
            reterLimiteDisp(valor);
        } else
            tpCompra = "(Debito)";

    }

    // métodos
    private int setValues(int data, String idCompra, float valor) { // pega os valores e coloca em suas devidas
                                                                    // variáveis
        this.data = data;
        this.idCompra = idCompra;
        this.valor = valor;

        return 1;
    }

    String tipoCompra(int tipoCompra) { // recebe um tipocompra int e retorna o respectivo tipo em uma String
        tpCompra = "Debito";

        if (tipoCompra == 1) {
            tpCompra = "Debito";
            return "tpCompra";
        }

        else {
            tpCompra = "Credito";
            return "tpCompra";
        }

    }

    // métodos getters e setters
    @Override
    public void debitar(float valor) {
        super.debitar(valor);
    }

    @Override
    public void devolverLimiteDisp(float valor) {
        super.devolverLimiteDisp(valor);
    }

    @Override
    public int getDiaFatura() {
        return super.getDiaFatura();
    }

    @Override
    public float getLimiteDisponivel() {
        return super.getLimiteDisponivel();
    }

    @Override
    public float getTaxaMensal() {
        return super.getTaxaMensal();
    }

    @Override
    public void reterLimiteDisp(float valor) {
        super.reterLimiteDisp(valor);
    }

    @Override
    public void setDiaFatura(int diaFatura) {
        super.setDiaFatura(diaFatura);
    }

    @Override
    public void setLimite(float limite) {
        super.setLimite(limite);
    }

    @Override
    public void setLimiteDisponivel(float limiteDisponivel) {
        super.setLimiteDisponivel(limiteDisponivel);
    }

    @Override
    public void setNomeBanco(String nomeBanco) {
        super.setNomeBanco(nomeBanco);
    }

    @Override
    public void setSaldo(float saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void setTaxaMensal(float taxaMensal) {
        super.setTaxaMensal(taxaMensal);
    }

}
