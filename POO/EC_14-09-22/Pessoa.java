
public class Pessoa {

	private int cpf = 0;
	private String nome = "";
	private Endereco ender = new Endereco();


	// ===============================================

	public Pessoa() {}

	public Pessoa(Pessoa p) {
		this.cpf = p.cpf;
		this.nome = p.nome;
	}

	// ===============================================


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
