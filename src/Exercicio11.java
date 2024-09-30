import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double pi = 3.14159;
        double isRaioCir = scan.nextDouble();
        double isResultRaio = isRaioCir * isRaioCir *isRaioCir;


        double isEsferaVol = (4/3.0)*pi*(isResultRaio);

        System.out.printf("VOLUME = %.3f\n", isEsferaVol);
    }
}
