package EstruturaSequencial;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int a = sc.nextInt();

        System.out.print("");
        int b = sc.nextInt();

        System.out.print("");
        int c = sc.nextInt();

        System.out.print("");
        int d = sc.nextInt();

        int difernca = (a*b) - (c*d);

        System.out.print("DIFERENCA = "+ difernca);
        sc.close();

    }
}
