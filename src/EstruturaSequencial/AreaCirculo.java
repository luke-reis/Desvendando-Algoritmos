package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        final double VALOR_PI = 3.14159;

        System.out.print("");
        double raio = sc.nextDouble();

        double area = VALOR_PI * Math.pow(raio,2);

        System.out.printf("A = %.4f", area);
        sc.close();
    }
}
