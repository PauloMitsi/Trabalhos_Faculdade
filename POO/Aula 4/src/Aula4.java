public class Aula4 {

    int x = 10;

    public static void main(String[] args) {


        Aula4 a = new Aula4();
        Aula4 a2 = new Aula4();

        System.out.println(a.x);

        a.mostraNumero();
        a.mostraEndereco();
        a2.mostraEndereco();

    }

    public void mostraNumero() {
        System.out.println(String.format("The number is: %d", this.x));
    }

    public void mostraEndereco() {
        System.out.println(String.format("The address is: 0x%s", Integer.toHexString(hashCode())));
    }
}
