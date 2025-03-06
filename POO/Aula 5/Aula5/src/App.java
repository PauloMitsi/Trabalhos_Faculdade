import java.util.Scanner;
import java.io.IOException;

public class App {

    public static int readNumber() {
        Scanner i = new Scanner(System.in);

        System.out.print("Insert a number: ");
        return i.nextInt();
    }

    public static void main(String[] args) {

        int n1 = readNumber();
        int n2 = readNumber();

        System.out.println(String.format("%d + %d = %d", n1, n2, n1 + n2));

    }
}
