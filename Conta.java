public class Conta implements InterfConta {

    // toString()
    @Override
    public String toString() {
        return "Conta [limiteDisponivel=" + limite + ", nomeBanco=" + nomeBanco + ", saldo=" + saldo
                + "]";
    }

    // atributos
    protected static float saldo;
    protected static String nomeBanco;
    protected static float limite;
    private float limiteDisponivel;
    private int diaFatura;
    private float taxaMensal;

    // construtores
    public Conta(float saldo, String nomeBanco, float limite) {
        Conta.saldo = saldo;
        Conta.nomeBanco = nomeBanco;
        Conta.limite = limite;
        limiteDisponivel = Conta.limite;
        diaFatura = -1;
        taxaMensal = 0;

    }

    // métodos
    public void debitar(float valor) { // tira o valor do saldo da conta
        saldo = saldo - valor;
    }

    public void reterLimiteDisp(float valor) { // tira o valor do limite da conta
        limite = limite - valor;
    }

    public void devolverLimiteDisp(float valor) { // devolve o valor para o limite da conta
        limite = limite - valor;
    }

    String tipoCompra(int tipoCompra) { // recebe o tipo da compra int e devolve uma string com o nome do tipo da compra
        if (tipoCompra == 1)
            return "Debito";
        else
            return "Credito";
        // if (tipoCompra == 2)
        // return "Credito";
        // if (tipoCompra == 3)
        // return "Credito";

    }

    // métodos getters/setters
    public float getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(float taxaMensal) {
        taxaMensal = this.taxaMensal;
    }

    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(float limiteDisponivel) {
        limiteDisponivel = this.limiteDisponivel;
    }

    public int getDiaFatura() {
        return diaFatura;
    }

    public void setDiaFatura(int diaFatura) {
        diaFatura = this.diaFatura;
    }

    public static float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        saldo = Conta.saldo;
    }

    public static float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        limite = Conta.limite;
    }

    public static String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        nomeBanco = Conta.nomeBanco;
    }

}