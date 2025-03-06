import java.util.Scanner;

public class TstPes {

    public static void main(String[] args) {
        Leitura l = new Leitura();
        Pessoa p = new Pessoa();

        p.setNome(l.entDados("Insert the name: "));

        p.setCpf(Integer.parseInt(l.entDados("Insert the cpf: ")));
        p.setRua(l.entDados("Insert the rua: "));
        System.out.println(p.getRua());
    }
}
