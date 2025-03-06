// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrecarga
    public ContaPoupanca(int agencia, int numero, Cliente c) {
        super(agencia, numero, c);
    }

    // Sobrescrita
    public void transferir(Conta c1, double qtd) {
        try {
            this.sacar(qtd * 1.10);
            c1.depositar(qtd);
        } catch (QtdNegException e) {
            transferir(c1, Double.parseDouble(Leitura.entDados("insira uma quantia correta: ")));
        } catch (SaldoInsuficienteException e) {
            transferir(c1, Double.parseDouble(Leitura.entDados("Insira uma nova quantia: ")));
        }
    }

    public void setTaxaDeRentabilidade() {
        this.saldo += this.saldo * 0.05;
    }



}
