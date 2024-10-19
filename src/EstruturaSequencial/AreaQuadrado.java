package EstruturaSequencial;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos lados do triângulo
        double l1 = sc.nextInt();
        double l2 = sc.nextInt();
        double l3 = sc.nextInt();

        // Cálculo de T
       double t = (l1+l2+l3)/2;

        // Cálculo da área usando a fórmula de Herão
       double area = Math.sqrt(t * (t - l1) * (t - l2) * (t - l3));

        System.out.printf("A área do triângulo é %.1f%n", area);

        sc.close();
    }
}
