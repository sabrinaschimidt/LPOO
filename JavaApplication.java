public class JavaApplication {
    // extends Conta {
    // public JavaApplication(float saldo, String nomeBanco, float limite) {
    // super(saldo, nomeBanco, limite);
    // }

    public static void main(String[] args) {

        Conta nuBank = new Conta(1000, "NuBank", 500f);
        System.out.println(nuBank.toString());

        new Compras(20220513, "padaria", 15f, nuBank);
        System.out.println(nuBank.toString());

        new Compras(20220513, "posto", 100f, nuBank, 1);
        System.out.println(nuBank.toString());

        new Compras(20220513, "cantina", 13f, nuBank, 2);
        System.out.println(nuBank.toString());

        for (int i = 0; i < Compras.listaCompra.size(); i++) {
            System.out.println(Compras.listaCompra.get(i).toString());
        }
    }

    // @Override
    // public String toString() {
    // return "JavaApplication []";
    // }

}
