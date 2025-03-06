public class TstHer{

	public static void main(String arg[]){ //class Loader

		Aluno a = new Aluno();

		a.setRa(7);
		a.setCurso("Eng. Comput.");
		a.setCpf(34);
		a.setNome("Aluno A");

		System.out.println("\nRA - Aluno: "+a.getRa());
		System.out.println("CURSO - Aluno: "+a.getCurso());

		System.out.println("\nCPF - Aluno: "+a.getCpf());
		System.out.println("NOME - Aluno: "+a.getNome());

	
	}// fim do main


}//fim da classe








