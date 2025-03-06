public class Aluno extends Pessoa implements CalcNota {

	private int ra;
	private String curso;


	// ==============================================

	public int getRa() {
		return ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void mostraNota() {
		System.out.println("Nota: " + NOTA);
	}

	@Override
	public int mudaNota() {
		return 0;
	}
}
