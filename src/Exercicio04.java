import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }
}
