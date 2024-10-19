package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class VolumeDoCilindro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("Calculando Volume do Cilindro");

        System.out.println();
        System.out.print("Digite o raio do cilindro: ");
        double raio = sc.nextDouble();

        System.out.print("Digite a altura do cilindro");
        double altura = sc.nextDouble();

        double volumeCilindo  = PI*(Math.pow(raio,2))*(altura);

        System.out.printf("O volume do cilindro é %.2f%n", volumeCilindo);
        sc.close();
    }
}
