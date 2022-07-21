/*
 * [Po] alterar somente o caminho dos arquivos .csv
 */

import java.io.IOException;

public class JavaApplication {
    public static void main(String[] args) throws IOException {

        Conta nuBank = new Conta(1000f, "NuBank");
        Conta caixa = new Conta(1000f, "Caixa");

        System.out.println("\nsituação das contas");
        System.out.println(nuBank.toString());
        System.out.println(caixa.toString());

        ManipuladorArquivo.csvCredito("./DATA/nubank-credito-2022-06.csv", nuBank);
        ManipuladorArquivo.csvDebito("./DATA/nubank-debito-2022-06.csv", caixa);

        System.out.println("\nLista: todas as compras:");
        Conta.listarCompra();

        System.out.println("\nLista: somente as compras debitos:");
        Conta.listarCompra("Debito");

        System.out.println("\nLista: somente as compras creditos:");
        Conta.listarCompra("Credito");

        System.out.println("\nsituação das contas");
        System.out.println(nuBank.toString());
        System.out.println(caixa.toString());

    }
}
