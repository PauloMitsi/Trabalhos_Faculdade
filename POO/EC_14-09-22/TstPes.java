public class TstPes {

	public static void main(String arg[]) { // class Loader

		Leitura l = new Leitura();
		Pessoa p = new Pessoa();
		Pessoa e = new Pessoa();


		// Endereco e = new Endereco();
		// e.setRua("Rua 1");
		// e.setNum(25);
		// p.setEnder(e);

		p.getEnder().setNum(16);
		p.getEnder().setRua("Jesus Cristo");

		p.setCpf(Integer.parseInt(Leitura.entDados("\nCPF: ")));
		p.setNome(Leitura.entDados("\nNOME: "));

		p.getEnder().getCid().setCodCid(1234);
		p.getEnder().getCid().setNomeCid("Londres");
		p.getEnder().getCid().setUfCid("43");

		System.out.println("\nCPF.: " + p.getCpf());
		System.out.println("NOME: " + p.getNome());

		System.out.println("\nRua.: " + p.getEnder().getRua());
		System.out.println("Numero: " + p.getEnder().getNum());

		System.out.println("\nRua.: " + p.getEnder().getCid().getCodCid());
		System.out.println("Numero: " + p.getEnder().getCid().getNomeCid());
		System.out.println("Numero: " + p.getEnder().getCid().getUfCid());

		System.out.println(e);



	}// fim do main


}// fim da classe


