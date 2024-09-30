import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double isNumberA = scan.nextDouble();
        double isNumberB = scan.nextDouble();
        double isNumberC = scan.nextDouble();

        double isTrianguloRet = (isNumberA * isNumberC) / 2;
        double isAreaCirc = (isNumberC * isNumberC) * 3.14159;
        double isAreaTrapezio = ((isNumberA + isNumberB)* isNumberC) / 2;
        double isAreaQuadrado = isNumberB * isNumberB;
        double isAreaRetangulo = isNumberA * isNumberB;

        System.out.printf("TRIANGULO: %.3f\n", isTrianguloRet);
        System.out.printf("CIRCULO: %.3f\n", isAreaCirc);
        System.out.printf("TRAPEZIO: %.3f\n", isAreaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", isAreaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", isAreaRetangulo);
    }
}
