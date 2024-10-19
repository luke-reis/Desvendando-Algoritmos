package EstruturaSequencial;

import java.util.Scanner;

public class MediaHarmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_NUMEROS = 3;

        System.out.println("Media Harmonica");


        System.out.print("Digite um número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite um número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite um número: ");
        double numero3 = sc.nextDouble();


        double fracaoMediaHarmonica = (1/ numero1) + (1/numero2) + (1/numero3);
        double mediaHarmonica = TOTAL_NUMEROS/fracaoMediaHarmonica;

        System.out.println();
        System.out.printf("A media harmonica dos números %.0f, %.0f, %.0f, é igual a %.2f",
        numero1,numero2, numero3, mediaHarmonica);

        sc.close();

    }
}
