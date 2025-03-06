import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TstMenu {

	public static void main(String arg[]) {

		Leitura l = new Leitura();

		boolean vai = true;
		int val1 = 0, val2 = 0, opcao = 0;
		String resp = "";


		val1 = Integer.parseInt(l.entDados("Objeto Informe o Valor1:"));
		val2 = Integer.parseInt(l.entDados("Objeto Informe o Valor2:"));

		while (vai) {

			System.out.println("\n======== MENU ========\n");
			System.out.println("\n1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) Dividir");
			System.out.println("4) Multiplicar");
			System.out.println("5) Sair");

			opcao = Integer.parseInt(Leitura.entDados("classe Escolha um opcao:"));

			switch (opcao) {
				case 1: {
					System.out.println("\nA Soma eh: " + somar(val1, val2));

					break;
				}
				case 2: {
					System.out.println("\nSUBTRAIR");
					break;
				}
				case 3: {
					System.out.println("\nDIVIDIR");
					break;
				}
				case 4: {
					System.out.println("\nMULTIPLICAR");
					break;
				}
				case 5: {
					System.out.println("\nSAIR");
					System.exit(0);
				}
				default: {
					System.out.println("\nDeve ser entre 1 e 5");
					break;
				}
			}// fim do switch


		} // fim do while

	}// fim do main

	public static int somar(int a, int b) {
		return (a + b);
	}

}// fim da classe


