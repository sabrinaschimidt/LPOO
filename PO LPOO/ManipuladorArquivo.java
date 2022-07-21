/*
 * Não pode alterar este arquivo
 * apenas no package (se precisar)
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipuladorArquivo {

	public static void csvCredito(String path, Conta conta) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		int k = 0;
		int nVezes = 1;
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {

				String[] array = linha.split(",");
				if (k > 0) {

					String[] tpStr = array[2].split(" "); // separa por espaço, no ultimo contem a informaçao de parcela
															// com "/"
					String[] parcelas = tpStr[tpStr.length - 1].split("/"); // busca por "/"
					if (parcelas.length > 1) {// encontra algo
						// System.out.println("isto é uma compra parcelada");
						nVezes = Integer.parseInt(parcelas[1]);
						new Compras(array[0], array[2], -Float.parseFloat(array[3]), conta,
								nVezes);
					} else {
						nVezes = 1;
						new Compras(array[0], array[2], -Float.parseFloat(array[3]), conta,
								nVezes);

					}
				}

			} else
				break;
			k = k + 1;
		}
		buffRead.close();
	}

	public static void csvDebito(String path, Conta conta) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		int k = 0;
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {

				String[] array = linha.split(",");
				if (k > 0) {

					new Compras(array[0], array[3], Float.parseFloat(array[1]), conta);
				}

			} else
				break;
			k = k + 1;
		}
		buffRead.close();
	}

}