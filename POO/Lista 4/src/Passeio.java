// Nome: Paulo Cesar De Oliveira Mitsi - RA:2410362

public class Passeio extends Veiculo implements Calc {

    private int qtdePassageiro;

    public Passeio(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int calcular() {

        return super.getCor().length() + super.getDataCadastro().length()
                + super.getModelo().length() + super.getPlaca().length()
                + super.getMarca().length();
    }

    public int calcVel() {
        int velMax = super.getVelocMax();
        return velMax * 1000;
    }

}
