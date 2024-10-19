package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ValorDoProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da peça 1: ");
        int codigo1 = sc.nextInt();

        System.out.print("Digite a quantidade comprada da peça 1:");
        int quantidade1 = sc.nextInt();

        System.out.print("Digite o valor peça 1: ");
        double valor1 = sc.nextDouble();

        System.out.println();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = sc.nextInt();

        System.out.print("Digite a quantidade comprada da peça 2:");
        int quantidade2 = sc.nextInt();

        System.out.print("Digite o valor peça 2: ");
        double valor2 = sc.nextDouble();

        double valorApagar = (quantidade1*valor1)+(quantidade2*valor2);

        System.out.printf("VALOR A SER PAGO: %.2f%n R$",valorApagar);

        sc.close();

    }
}
