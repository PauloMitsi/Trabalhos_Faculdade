// Nome: Paulo Cesar De Oliveira Mitsi - RA:2410362

public class Carga extends Veiculo implements Calc {

    private int tara;
    private int cargaMax;

    public Carga(int tara, int cargaMax) {
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int calcular() {
        return super.getQtdRodas() + super.getVelocMax();
    }

    public int calcVel() {
        int vCM = super.getVelocMax();
        return vCM * 100000;
    }


}
