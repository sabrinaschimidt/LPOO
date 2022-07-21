public class CompraCartaoCredito extends CompraCartao {

    // toString()
    @Override
    public String toString() {
        return super.toString();
    }

    // atributos
    int diaFatura;

    // construtores
    public CompraCartaoCredito(float saldo, String nomeBanco, float limite, int data, String idCompra, float valor,
            Conta conta, int diaFatura) {
        super(saldo, nomeBanco, limite, data, idCompra, valor, conta);
        this.diaFatura = diaFatura;
    }

    public CompraCartaoCredito(int data, String idCompra, float valor, Conta Conta, int diaFatura) {
        super(data, idCompra, valor, Conta);
        this.diaFatura = diaFatura;
    }

    public CompraCartaoCredito(int data, String idCompra, float valor, Conta Conta, int nParcelas, int diaFatura) {
        super(data, idCompra, valor, Conta, nParcelas);
        this.diaFatura = diaFatura;
    }

    public CompraCartaoCredito(float saldo, String nomeBanco, float limite, int data, String idCompra, float valor,
            Conta conta) {
        super(saldo, nomeBanco, limite, data, idCompra, valor, conta);

    }

    // métodos
    @Override
    public void debitar(float valor) {
        super.debitar(valor);
    }

    @Override
    public void devolverLimiteDisp(float valor) {
        super.devolverLimiteDisp(valor);
    }

    @Override
    public void reterLimiteDisp(float valor) {
        super.reterLimiteDisp(valor);
    }

    // getters e setters
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