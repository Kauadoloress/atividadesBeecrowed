import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int isNumberA = scan.nextInt();
        int isNumberB = scan.nextInt();
        int isNumberC = scan.nextInt();
        int isNumberD = scan.nextInt();

        int isDiferenca = (isNumberA * isNumberB) - (isNumberC * isNumberD);

        System.out.println("DIFERENÇA = \n" + isDiferenca);
    }
}
