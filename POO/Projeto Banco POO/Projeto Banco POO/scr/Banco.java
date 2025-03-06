// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class Banco {
    private String nome;
    private String cnpj;

    public Banco(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void emprestimo(Conta c1, double qtd) {
        try {
            c1.depositar(qtd);
            c1.setDivida(qtd);
        } catch (QtdNegException e) {
            System.out.println("Quantia invalida!");
            emprestimo(c1, Double.parseDouble(Leitura.entDados("Insira a quantia correta: ")));
        }
    }

    public void rendimento(Conta c1) {
        double div = c1.getDivida() * 0.05;
        double RENDIMENTO = 100;
        double retorno = RENDIMENTO - div;

        if (retorno < 0) {
            System.out.println("Rendimennto nao efetuado. Pague sua divida!");
        } else {
            c1.saldo += retorno;
        }
    }

}
