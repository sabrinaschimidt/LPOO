/*
 * Não pode alterar este arquivo
 * apenas no package (se precisar)
 */

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data() {
    }

    void extrairData(String dataString) {

        String array[] = dataString.split("/");
        if (array.length > 1) {

            dia = Integer.parseInt(array[0]);
            mes = Integer.parseInt(array[1]);
            ano = Integer.parseInt(array[2]);
        }

        array = dataString.split("-");
        if (array.length > 1) {

            ano = Integer.parseInt(array[0]);
            mes = Integer.parseInt(array[1]);
            dia = Integer.parseInt(array[2]);
        }
    }

}
