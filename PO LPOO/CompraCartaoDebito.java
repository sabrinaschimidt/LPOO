/* 
 * [Po]
 * implementar construtor
 */

public class CompraCartaoDebito extends CompraCartao {

    @Override
    public String toString() {
        return super.toString() + getConta().getNomeBanco() + "; " + "(Debito)";
    }

    // construtor
    public CompraCartaoDebito(String data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        conta.debitar(valor);
    }
    // fim construtor

    // métodos getters e setters
    @Override
    public Conta getConta() {
        return super.getConta();
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
    public void setConta(Conta conta) {
        super.setConta(conta);
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
    // fim métodos getters e setters

}
