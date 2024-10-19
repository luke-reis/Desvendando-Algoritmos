package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class IndiceDeMassaCorporal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("O IMC, ou Índice de Massa Corporal, é um cálculo simples que\n" +
        "determina se a pessoa está dentro do peso considerado ideal para a sua altura.");

        System.out.println();
        System.out.print("resultados menores que 16 — magreza grave;\n" +
                        "resultados entre 16 e 16,9 — magreza moderada;\n" +
                        "resultados entre 17 e 18,5 — magreza leve;\n" +
                        "resultados entre 18,6 e 24,9 — peso ideal;\n" +
                        "resultados entre 25 e 29,9 — sobrepeso;\n" +
                        "resultados entre 30 e 34,9 — obesidade grau I;\n" +
                        "resultados entre 35 e 39,9 — obesidade grau II ou severa;\n" +
                        "resultados maiores do que 40 — obesidade grau III ou mórbida\n");

        System.out.println();
        System.out.print("Calulador de IMC - Indice de Massa Coporal");

        System.out.println();
        System.out.print("Digite o seu peso:");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = (peso)/(Math.pow(altura,2));

        System.out.println();
        System.out.printf("O seu IMC é %.2f", imc);
        sc.close();
    }
}
