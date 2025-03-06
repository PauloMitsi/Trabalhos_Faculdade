// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public abstract class Conta {
    protected double saldo = 0;
    private int agencia = 0;
    private int numero = 0;
    private Cliente titular = null;
    protected double divida = 0;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    // Sobrecarga
    public Conta(int agencia, int numero, Cliente c) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = c;
    }

    public void depositar(double qtd) throws QtdNegException {
        if (qtd < 0) {
            throw new QtdNegException("Quantia Invalida!");
        } else {
            this.saldo += qtd;
        }
    }

    public void sacar(double qtd) throws SaldoInsuficienteException, QtdNegException {
        if (this.saldo < qtd) {
            throw new SaldoInsuficienteException("Saldo Insuficiente: " + this.saldo);
        } else if (qtd < 0) {
            throw new QtdNegException("Quantia invalida!");
        } else {
            this.saldo -= qtd;
        }
    }

    public abstract void transferir(Conta c1, double qtd);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws QtdNegException {
        if (saldo < 0) {
            throw new QtdNegException("Quantia Invalida!");
        } else {
            this.saldo = saldo;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida += divida;
    }

    @Override
    public String toString() {
        return String.format("%s [Saldo: R$%.2f, numero: %d, agencia: %d, titular: %s]",
                this.getClass().getTypeName(), this.saldo, this.numero, this.agencia, this.titular);
    }

    // Sobrescrita
    public boolean equals(Object obj) {
        Conta c = (Conta) obj;

        if (c.getNumero() == this.numero && c.getAgencia() == this.agencia) {
            return true;
        } else {
            return false;
        }
    }

}
