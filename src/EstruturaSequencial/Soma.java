package EstruturaSequencial;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int x = sc.nextInt();

        System.out.print("");
        int y = sc.nextInt();

        int soma = x+y;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
