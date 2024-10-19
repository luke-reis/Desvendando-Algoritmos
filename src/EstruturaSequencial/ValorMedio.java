package EstruturaSequencial;

import java.util.Scanner;

public class ValorMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

            double r = Math.pow((a+b),2);
            double s = Math.pow((b+c),2);
            double d = (r+s)/2;

        System.out.printf("O valor medio é %.1f ", d);

        sc.close();
    }
}
