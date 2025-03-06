// Nome: Paulo Cesar De Oliveira Mitsi - RA:2410362

public class TstVeic {

    public static void main(String[] args) {

        Leitura l = new Leitura();
        Passeio van = new Passeio(5);
        Carga caminhao = new Carga(100, 1000);

        System.out.println("======Veiculo de passeio======");

        van.setCor(l.entDados("Digite a cor do veiculo: "));
        van.setDataCadastro(l.entDados("Digite a data de cadastro: "));
        van.setMarca(l.entDados("Digite a marca: "));
        van.setModelo(l.entDados("Digite o modelo: "));
        van.setMotor(new Motor(Integer.parseInt(l.entDados("Digite a quantidade de pistoes: ")),
                Integer.parseInt(l.entDados("Digite a potencia: "))));
        van.setPlaca(l.entDados("digite a placa do veiculo: "));
        van.setQtdRodas(Integer.parseInt(l.entDados("Digite a quantidade de rodas: ")));
        van.setVelocMax(Integer.parseInt(l.entDados("Digite a velocidade maxima: ")));

        int vM = van.calcVel();
        int qtdLetra = van.calcular();
        System.out.println(van.getVelocMax() + "km/h" + " " + vM + "m/h" + " "
                + " Soma das letras das strings: " + qtdLetra);


        System.out.println("\n======Veiculo de Carga======");

        caminhao.setCor(l.entDados("Digite a cor do veiculo: "));
        caminhao.setDataCadastro(l.entDados("Digite a data de cadastro: "));
        caminhao.setMarca(l.entDados("Digite a marca: "));
        caminhao.setModelo(l.entDados("Digite o modelo: "));
        caminhao.setMotor(
                new Motor(Integer.parseInt(l.entDados("Digite a quantidade de pistoes: ")),
                        Integer.parseInt(l.entDados("Digite a potencia: "))));
        caminhao.setPlaca(l.entDados("digite a placa do veiculo: "));
        caminhao.setQtdRodas(Integer.parseInt(l.entDados("Digite a quantidade de rodas: ")));
        caminhao.setVelocMax(Integer.parseInt(l.entDados("Digite a velocidade maxima: ")));

        int vMc = caminhao.calcVel();
        int qtdNumero = caminhao.calcular();

        System.out.println(caminhao.getVelocMax() + "km/h" + " " + vMc + "cm/h"
                + " Soma dos numeros: " + qtdNumero);

    }
}
