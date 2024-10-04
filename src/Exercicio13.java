import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int isNumberA = scan.nextInt();
        int isNumberB = scan.nextInt();
        int isNumberC = scan.nextInt();

        int isMaiorAB = (isNumberA + isNumberB + Math.abs(isNumberA - isNumberB))/2;
        int isMaiorABandC = (isMaiorAB + isNumberC + Math.abs(isMaiorAB - isNumberC))/2;
        System.out.println(isMaiorABandC + " eh o maior");
    }
}
