/*
 * [Po] encapsular: todos atributos como privados e criar getters e setters
 * Implementar método que lista e printa todas as compras 
 * (veja como foi implementado o método que imprime somente debito/credito)
 */

public class Conta implements InterfConta {

    @Override
    public String toString() {
        return "Conta " + this.nomeBanco + "- Saldo:" + this.saldo + ", limite Disponível: ";
    }

    // atributoos privados
    private float saldo;
    private String nomeBanco;
    // fim atributoos privados

    // construtor
    public Conta(float saldo, String nomeBanco) {
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }
    // fim construtor

    // metodos da intervace
    @Override
    public void debitar(float valor) {
        this.saldo = (this.saldo + valor);
    }
    // fim metodos da intervace

    // metodos da classe
    public static void listarCompra() {
        for (int i = 0; i < Compras.listaCompra.size(); i++)
            System.out.println(Compras.listaCompra.get(i).toString());
    }

    public static void listarCompra(String tipo) {
        if (tipo == "Debito") {
            for (int i = 0; i < Compras.listaCompra.size(); i++) {
                if (Compras.listaCompra.get(i) instanceof CompraCartaoDebito) {
                    System.out.println(Compras.listaCompra.get(i).toString());
                }
            }
        }
        if (tipo == "Credito") {
            for (int i = 0; i < Compras.listaCompra.size(); i++) {
                if (Compras.listaCompra.get(i) instanceof CompraCartaoCredito) {
                    System.out.println(Compras.listaCompra.get(i).toString());
                }
            }
        }
    }
    // fim metodos da classe

    // getters e setters
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    // fim getters e setters

}
