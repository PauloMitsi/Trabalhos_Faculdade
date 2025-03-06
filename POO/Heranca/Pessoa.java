public abstract class Pessoa {

	private int cpf;
	private String nome;
	private Endereco ender;

	// ==============================================

	public Pessoa() {
		System.out.println("\nConstrutor 1 - Default");
		cpf = 10;
		nome = "";
		ender = new Endereco();
	}

	public Pessoa(int cpf, String nome, Endereco ender) {
		System.out.println("\nConstrutor 2 - Sobrecarga");
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
	}

	public Pessoa(String y, int x, Endereco z) {
		System.out.println("\nConstrutor 3 - Sobrecarga");
		this.cpf = x;
		this.nome = y;
		this.ender = z;
	}

	public Pessoa(String y) {
		System.out.println("\nConstrutor 4 - Sobrecarga: " + y);
	}


	// ===================================
	// ERRO DE TIPO DOS MÉTODOS
	/*
	 * public void impDados(int k){ System.out.println("\nK vale: "+k); }
	 * 
	 * public int impDados(int w){ System.out.println("\nW vale: "+w); return (w+1); }
	 */


	// ===============================================

	public Endereco getEnder() {
		return ender;
	}

	public void setEnder(Endereco ender) {
		this.ender = ender;
	}

	// ===============================================

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
