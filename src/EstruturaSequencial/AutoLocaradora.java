package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AutoLocaradora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double DESCONTO = 0.1f;

        System.out.println("AutoLocadora, calculo de fatura");

        System.out.println();
        System.out.print("Digite a  taxa fixa: ");
        double taxaFixa = sc.nextDouble();

        System.out.print("Digite a taxa de kilometragem: ");
        double taxaKilometragem = sc.nextDouble();

        System.out.print("O numero de dias alugados: ");
        double diasAlugados = sc.nextDouble();

        System.out.print("O numero de quilometros rodados: ");
        double kilometragem = sc.nextDouble();

        double valorKilometragem = taxaKilometragem * kilometragem;
        double valorDescontado = taxaFixa*diasAlugados*DESCONTO;
        double valorTotal = ((taxaFixa*diasAlugados) * DESCONTO) - DESCONTO;

        System.out.printf("Número de dias alugados: %.0f%n", diasAlugados);
        System.out.printf("Quilometragem rodada: %.2f km%n", kilometragem);
        System.out.printf("Valor total do desconto: R$ %.2f%n", valorDescontado);
        System.out.printf("Valor total do aluguel: R$ %.2f%n", valorTotal);



        sc.close();
    }
}
