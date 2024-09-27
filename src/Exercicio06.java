import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double isPesoA = 2;
        double isPesoB = 3;
        double isPesoC = 5;

        double isNotaA = scan.nextDouble();
        double isNotaB = scan.nextDouble();
        double isNotaC = scan.nextDouble();

        double isSoma = ((isPesoA * isNotaA) + (isPesoB * isNotaB) + (isPesoC * isNotaC)) / (isPesoA + isPesoB + isPesoC);

        System.out.println("MEDIA = " + isSoma);


    }
}
