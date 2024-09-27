import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int a = scan.nextInt();
        System.out.println("Digite um valor:");
        int b = scan.nextInt();
        int x = a + b;

        System.out.println(x);

    }
}
