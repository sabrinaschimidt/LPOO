/* 
 * [Po]
 * implementar construtor
 */

public class CompraCartaoCredito extends CompraCartao {

    @Override
    public String toString() {
        return super.toString() + getConta().getNomeBanco() + ";" + "(Crédito)";
    }

    // Construtor
    public CompraCartaoCredito(String data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
    }
    // fim Construtor

}
