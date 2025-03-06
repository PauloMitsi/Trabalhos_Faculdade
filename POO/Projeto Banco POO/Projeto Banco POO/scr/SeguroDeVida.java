// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class SeguroDeVida extends Conta implements Tributavel {

    public SeguroDeVida(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrescrita
    public void getAnuidade() {
        this.saldo -= 5;
        if (this.getSaldo() < 0) {
            this.setDivida(5);
        }
    }

    // Sobrescrita
    public void transferir(Conta c1, double qtd) {
        try {
            super.sacar(qtd);
            c1.depositar(qtd);
        } catch (QtdNegException e) {
            transferir(c1, Double.parseDouble(Leitura.entDados("insira uma quantia correta: ")));
        } catch (SaldoInsuficienteException e) {
            transferir(c1, Double.parseDouble(Leitura.entDados("Insira uma nova quantia: ")));
        }
    }

}
