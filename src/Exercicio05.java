import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double isPesoA = 3.5;

        double isPesoB = 7.5;


        double isNotaA = scan.nextDouble();

        double isNotaB = scan.nextDouble();

        double isMedia = ((isPesoA*isNotaA) + (isPesoB*isNotaB)) /(isPesoA + isPesoB);

        System.out.printf("MEDIA = %.5f", isMedia);
    }
}
