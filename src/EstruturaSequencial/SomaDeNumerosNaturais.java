package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeNumerosNaturais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a soma dos primeiros números naturais");

        System.out.println();
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        double soma = (numero*(numero+1))/2;

        System.out.printf("O resultado da soma é %.2f", soma);
        sc.close();

    }
}
