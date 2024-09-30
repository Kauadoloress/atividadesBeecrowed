import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String isNomeVendedor = scan.nextLine();
        double isSalarioFixo = scan.nextDouble();
        double isVendasMes = scan.nextDouble();

        double isComissao = isSalarioFixo + (isVendasMes * 0.15);

        System.out.printf("TOTAL = R$ %.2f", isComissao);
    }
}
