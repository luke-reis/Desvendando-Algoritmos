package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Investimentos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor constante da aplicação mensal: ");
        double aplicacaoMensal = sc.nextDouble();

        System.out.print("Digite o valor atual da taxa selic: ");
        double taxaSelic = sc.nextDouble();

        System.out.print("Digite o número de meses que vai investir: ");
        int numeroDeMeses = sc.nextInt();

        double calculoValorAcumulado = (Math.pow((1+ taxaSelic),numeroDeMeses) - 1)/taxaSelic;
        double valorAcumulado = calculoValorAcumulado * aplicacaoMensal;

        System.out.printf("O valor acumulado é de: %.2f", valorAcumulado);

        sc.close();

    }
}
