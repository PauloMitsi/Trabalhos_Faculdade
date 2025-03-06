// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class Cliente {
    private String nome = " ";
    private int idade = 0;
    private String cpf = " ";

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", cpf=" + cpf + "]";
    }

}
