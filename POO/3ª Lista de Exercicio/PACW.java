// NOME: Paulo Cesar De Oliveira Mitsi RA: 2410362

import java.util.Scanner;

public class PACW {

    /*
     * 
     * i) Classe Integer: metodo compare().
     * 
     * ii) O metodo compareNumeros() compara dois valores do tipo primitivo inteiro e retorna o
     * maior numero.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
     */

    public static int compareNumeros(int a, int b) {
        int maiorN = Integer.compare(a, b);

        if (maiorN < 0) {
            return b;
        } else {
            return a;
        }
    }

    /*
     * i) Classe Boolean: metodo parseBoolean().
     * 
     * ii) O metodo convertBooleano() compara a String introduzida como argumento e retorna true se,
     * somente se, for escrita da forma "True" ou "true", caso contrario retorna false.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Boolean.html
     */

    public static boolean convertBooleano(String txt) {
        return Boolean.parseBoolean(txt);
    }

    /*
     * i) Classe Character: metodo isLetter().
     * 
     * ii) O metodo ELetra(), retornar se o caracter passado no parâmentro é uma letra, caso seja,
     * retornar true, caso contrario, retorna false.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
     */

    public static boolean ELetra(char c) {
        return Character.isLetter(c);
    }

    /*
     * i) Classe Double: metodo toString().
     * 
     * ii) o metodo convertDouble_Str() converte um numero double para String
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html
     */

    public static String convertDouble_Str(double d) {
        return Double.toString(d);
    }

    /*
     * i) Classe Byte: metodo decode().
     * 
     * ii) o metodo convertStr_Byte() converte uma string para o valor em byte.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Byte.html
     */

    public static byte convertStr_Byte(String s) {
        return Byte.decode(s);
    }

    /*
     * i) Classe Short: metodo parseShort().
     * 
     * ii) o metodo convertStr_Short() converte uma string para short.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Short.html
     */

    public static short convertStr_Short(String s) {
        return Short.parseShort(s);
    }

    /*
     * i) Classe Float: metodo parseFloat().
     * 
     * ii) o metodo convertStr_Float() converte uma string para Float.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Float.html
     */

    public static float convertStr_Float(String s) {
        return Float.parseFloat(s);
    }

    /*
     * i) Classe Long: metodo parseLong().
     * 
     * ii) o metodo convertStr_Long() converte uma string para Long.
     * 
     * iii) Referência: https://docs.oracle.com/javase/7/docs/api/java/lang/Long.html
     */

    public static long convertStr_Long(String s) {
        return Long.parseLong(s);
    }

    public static String entDados(String txt) {
        System.out.printf(txt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void menu() {
        System.out.println("================================\n" + "1) Integer\n" + "2) Boolean\n"
                + "3) Character\n" + "4) Double\n" + "5) Byte\n" + "6) Short\n" + "7) Float\n"
                + "8) Long\n" + "0) Sair\n" + "================================\n"
                + "Escolha uma opcao: ");
        String opt = entDados("");

        switch (opt) {
            case "1":
                String n1 = entDados("Digite o primeiro numero: ");

                String n2 = entDados("Digite o segundo numero: ");

                System.out.printf("%d e o maior",
                        compareNumeros(Integer.parseInt(n1), Integer.parseInt(n2)));
                break;
            case "2":

                String txt = entDados(
                        "Escreva true para retornar true ou qualquer outra coisa para retornar false: ");

                System.out.println(convertBooleano(txt));
                break;

            case "3":
                String l = entDados("Escreva uma letra ou numero: ");

                System.out.printf("%s e letra: %b\n", l, ELetra(l.charAt(0)));
                break;
            case "4":

                String dConvertido =
                        entDados("Digite um numero double para ser convertido para string: ");

                System.out.println(convertDouble_Str(Double.parseDouble(dConvertido)));
                break;
            case "5":
                String sByte = entDados(
                        "Escreva um numero de tamanho de até 127 pra ser convertido para byte: ");
                System.out.println(convertStr_Byte(sByte));
                break;
            case "6":
                String sShort = entDados(
                        "Escreva um numero de tamanho até 36767 pra ser convertido para short: ");
                System.out.println(convertStr_Short(sShort));
                break;
            case "7":
                String sFloat = entDados("digite um numero para ser convertido para float: ");
                System.out.println(convertStr_Float(sFloat));
                break;
            case "8":
                String sLong = entDados("digite um numero para ser convertido para Long: ");
                System.out.println(convertStr_Long(sLong));
                break;
            case "0":
                System.out.println("SAINDO");
                break;
            default:
                break;
        }
    }


    public static void main(String[] args) {
        menu();
    }
}
