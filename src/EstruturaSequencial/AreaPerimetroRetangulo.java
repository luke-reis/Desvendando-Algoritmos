package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AreaPerimetroRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calulando Area e Perimetro do Retangulo");

        System.out.println();
        System.out.print("Digie o comprimento do retangulo");
        double comprimento = sc.nextDouble();

        System.out.print("Digie o largura do retangulo");
        double largura = sc.nextDouble();

        double areaDoRetangulo = comprimento*largura;
        double perimetroRetangulo = 2*(comprimento+largura);

        System.out.printf("A área do retangulo %.3f%n é", areaDoRetangulo);
        System.out.printf("O perimeitro do retangulo é %.3f%n", perimetroRetangulo);
        sc.close();

    }
}
