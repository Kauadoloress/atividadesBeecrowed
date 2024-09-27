import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int a = scan.nextInt();

        int b = scan.nextInt();

        int isProd = a * b;

        System.out.println("PROD = " + isProd);
    }
}
