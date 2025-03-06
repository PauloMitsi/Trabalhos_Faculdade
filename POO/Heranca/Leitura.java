import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

	public static String entDados(String rotulo){

		System.out.println(rotulo);

		InputStreamReader teclado =  new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String resp = "";

		try{
			resp = buff.readLine();
		}
		catch(IOException zeh){
			System.out.println("\n== ERRO ==");
		}
		return resp;
	}// fim entDados
}//fim da classe








