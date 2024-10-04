import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int isValueX = scan.nextInt();
        double isValueZ = scan.nextDouble();

        double isConsumeMed = isValueX / isValueZ;

        System.out.printf("%.3f km/l%n", isConsumeMed);
    }
}
