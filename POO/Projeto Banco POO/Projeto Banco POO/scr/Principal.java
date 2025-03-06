import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        /*
         * Banco b = new Banco("Santander", "17.467.515/0043-58"); Leitura l = new Leitura();
         * 
         * Cliente c1 = new Cliente("Gustavo Giachetto", 21, "14569862112"); ContaCorrente cc1 = new
         * ContaCorrente(9102, 010076351); ContaPoupanca cp1 = new ContaPoupanca(9103, 010076354);
         * SeguroDeVida svd1 = new SeguroDeVida(9104, 010076356);
         * 
         * Cliente c2 = new Cliente("Paulo Mitsi", 19, "12365478998"); ContaCorrente cc2 = new
         * ContaCorrente(9106, 013076351); ContaPoupanca cp2 = new ContaPoupanca(9107, 014076354);
         * SeguroDeVida svd2 = new SeguroDeVida(9108, 015076356);
         * 
         * 
         * // testando deposito double qtd = 0;
         * 
         * while (qtd <= 0) { try { qtd =
         * Double.parseDouble(l.entDados("Insira a quantia a depositar: ")); cc1.depositar(qtd); }
         * catch (QtdNegException e) { System.out.println("insira uma quantia positiva !"); } }
         * 
         * qtd = 0;
         * 
         * // testando setSaldo while (qtd <= 0) { try { qtd =
         * Double.parseDouble(l.entDados("Insira a quantia a ser o saldo: ")); cc1.setSaldo(qtd); }
         * catch (QtdNegException e) { System.out.println("insira uma quantia positiva !"); } }
         * 
         * qtd = 0;
         * 
         * // testando emprestimo
         * 
         * qtd = Double.parseDouble(l.entDados("Insira a quantia a ser o emprestimo: "));
         * b.emprestimo(cc1, qtd);
         * 
         * 
         * // testando transferencia qtd =
         * Double.parseDouble(l.entDados("Insira a quantia a realizar a transferencia: "));
         * cc1.transferir(cp1, qtd);
         * 
         * // testando rendimento System.out.println("Saldo: " + cc1.getSaldo());
         * System.out.println("divida: " + cc1.getDivida()); b.rendimento(cc1);
         * System.out.println("Saldo: " + cc1.getSaldo());
         */


        Conta c1 = new ContaCorrente(123, 123);
        Conta c2 = new ContaCorrente(321, 321);
        Conta c4 = new ContaCorrente(1243, 1234);
        GerConta bdg = new GerConta();


        c1 = bdg.addConta(c1);
        c2 = bdg.addConta(c2);
        c4 = bdg.addConta(c4);

        List<Conta> lb = bdg.getBdConta();

        System.out.println(lb);

        lb = bdg.getBdConta();

        c1 = bdg.removeConta(c1);

        System.out.println(lb);

    }
}
