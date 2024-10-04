import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double isValorX1 = scan.nextDouble();
        double isValorY1 = scan.nextDouble();

        double isValorX2 = scan.nextDouble();
        double isValorY2 = scan.nextDouble();

        double isDeltaX = isValorX2 - isValorX1;
        double isDeltaY = isValorY2 - isValorY1;

        double isDistanciaTotal = Math.sqrt((isDeltaX * isDeltaX) + (isDeltaY * isDeltaY));

        System.out.printf("%.4f%n", isDistanciaTotal);
    }
}
