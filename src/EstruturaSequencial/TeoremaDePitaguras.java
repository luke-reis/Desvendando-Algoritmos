package EstruturaSequencial;

import java.util.Scanner;

public class TeoremaDePitaguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Entrada dos valores de M e N
            int m = sc.nextInt();
            int n = sc.nextInt();

            // Calcula os lados do triângulo e a hipotenusa
            int l1 = (m*m) - (n*n);
            int l2 = 2*m*n;
            int h = (m*m) + (n*n);

        // Exibe os resultados com espaçamento adequado
        System.out.println("O l1 possui o valor de: " + l1);
        System.out.println("O l2 possui o valor de: " + l2);
        System.out.println("A hipotenusa possui o valor de: " + h);

        sc.close();
    }
}
