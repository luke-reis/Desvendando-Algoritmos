package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class NotasMediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Caluando Media Ponderada de notas");

        System.out.println();
        System.out.print("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a primeira nota:");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a primeira nota:");
        double nota3 = sc.nextDouble();

        double mediaPonderada =  (nota1*2) + (nota2*3) + (nota3*5)/3;

        System.out.println();
        System.out.printf("A media ponderada das notas obtidas é igual a %.2f", mediaPonderada);
        sc.close();

    }
}
