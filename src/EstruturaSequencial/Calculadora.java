package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Calculadora");

            System.out.println();
            System.out.print("Digite um número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Digite outro número: ");
            double numero2 = sc.nextDouble();

                double soma = numero1 + numero2;
                double subtracao = numero1 - numero2;
                double mutiplicacao = numero1 * numero2;
                double divisao = numero1 / numero2;

            System.out.println();
            System.out.printf(" A soma  é igual a %.0f%n ", soma);
            System.out.printf("A subtração é igual a %.0f%n " , subtracao);
            System.out.printf("A multiplicação é igual a %.0f%n ", mutiplicacao);
            System.out.printf("A divisão é igual a %.2f%n ", divisao);

            sc.close();

    }
}
