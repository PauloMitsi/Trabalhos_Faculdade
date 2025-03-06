
public class Pessoa extends Endereco {

    private int cpf = 0;
    private String nome = "";

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if (cpf < 0) {
            this.cpf = 0;
        } else {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (10 <= nome.length() && nome.length() <= 20) {
            this.nome = nome;
        } else {
            System.out.println("Invalid Input !");
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCpf: %d\n", this.nome, this.cpf);
    }
}
