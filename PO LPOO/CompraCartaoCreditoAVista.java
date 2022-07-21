/* 
 * [Po]
 * implementar construtor
 * encapuslar: atributos privados e criar getters e setters
 */

public class CompraCartaoCreditoAVista extends CompraCartaoCredito {

    @Override
    public String toString() {
        return super.toString();
    }

    // construtor
    public CompraCartaoCreditoAVista(String data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);

    }
    // fim construtor

    // getters e setters
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

    // fim getters e setters

}
