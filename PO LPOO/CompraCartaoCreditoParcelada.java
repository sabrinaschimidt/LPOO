/* 
 * [Po]
 * implementar construtor
 * encapuslar: atributos privados e criar getters e setters
 */

public class CompraCartaoCreditoParcelada extends CompraCartaoCredito {
    @Override
    public String toString() {
        return super.toString();
    }

    // atributos privados
    private int nParcelas;
    private float valorTotal;
    // fim atributos privados

    // construtor
    public CompraCartaoCreditoParcelada(String data, String idCompra, float valor, Conta conta, int nParcelas) {
        super(data, idCompra, valor, conta);
        this.nParcelas = nParcelas;

    }
    // fim construtor

    // métodos publicos
    public void calcValorTotal() {
        this.valorTotal = this.getValor() * nParcelas;
    }
    // fim métodos publicos

    // getters e setters
    public int getnParcelas() {
        return nParcelas;
    }

    public void setnParcelas(int nParcelas) {
        this.nParcelas = nParcelas;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
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
