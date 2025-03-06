package Modelo;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1

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

    public void emprestimo(Conta c1, double qtd) throws QtdNegException {
        c1.depositar(qtd);
        c1.setDivida(qtd);

    }

    public void rendimento(Conta c1) throws DividaAltaException {
        double div = c1.getDivida() * 0.05;
        double RENDIMENTO = 100;
        double retorno = RENDIMENTO - div;

        if (retorno < 0) {
            throw new DividaAltaException();
        } else {
            c1.saldo += retorno;
        }
    }
}
