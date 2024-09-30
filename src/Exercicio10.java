import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("Produto1\n");
        int isNumberProduct1 = scan.nextInt();
        int isQuantProduct1 = scan.nextInt();
        double isValorProduct1 = scan.nextDouble();

        System.out.println("Produto02");
        int isNumberProduct2 = scan.nextInt();
        int isQuantProduct2 = scan.nextInt();
        double isValorProduct2 = scan.nextDouble();

        double isValorTotal = ((isQuantProduct1 * isValorProduct1) + (isQuantProduct2 * isValorProduct2));

        System.out.printf("VALOR A PAGAR: R$ %.2f", isValorTotal);
    }
}
