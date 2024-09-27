import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double n =  3.14159;

        double raio = scan.nextDouble();

        double isAreaDoCirculo = (raio * raio) * n;

        System.out.printf("A = %.4f\n", isAreaDoCirculo);
    }
}
