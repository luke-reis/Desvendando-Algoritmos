package EstruturaSequencial;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double potencicao = Math.pow(b,2) - (4*a*c);

        System.out.printf("O valor de delta é %.1f", potencicao);
        sc.close();

    }
}
