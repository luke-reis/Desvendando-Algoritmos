package EstruturaSequencial;

import java.util.Scanner;

public class InversaoDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        String numeroStr = Integer.toString(numero);
        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();

        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);

        System.out.println("Numero original: " + numero);
        System.out.println("Numero invertido: " + numeroInvertido);
        sc.close();
    }
}
