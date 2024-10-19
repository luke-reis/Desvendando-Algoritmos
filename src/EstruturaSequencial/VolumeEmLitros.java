package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class VolumeEmLitros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double LITROS_POR_METRO_CUBICO = 1000;

        System.out.println("Calculando volume da agua em litros");

        System.out.println();
        System.out.print("Digite um dos lados do cubo: ");
        double ladoPrincipal = sc.nextDouble();

        double volumeCubo = Math.pow(ladoPrincipal,3);
        double litros = volumeCubo*LITROS_POR_METRO_CUBICO;

        System.out.printf("Existe cerca de %.3f litros de água dentro do cubo", litros);
        sc.close();
    }
}
