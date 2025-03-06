public class Endereco {

	private String rua = "";
	private int num = 0;
	private Cidade cidade = new Cidade();


	public Cidade getCid() {
		return cidade;
	}

	public void setCid(Cidade c) {
		this.cidade = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}


}
