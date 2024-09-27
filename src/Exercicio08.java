import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int isNumberFun = scan.nextInt();
        int isDaysWork = scan.nextInt();
        double isHoursMoney = scan.nextDouble();

        double isTotalDeGanho = (isDaysWork * isHoursMoney);

        System.out.print("NUMBER = " + isNumberFun + ("\n"));
        System.out.printf("SALARY = U$ %.2f", isTotalDeGanho);
    }
}
