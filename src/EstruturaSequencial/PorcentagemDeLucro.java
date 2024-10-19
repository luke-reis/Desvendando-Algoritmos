package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class PorcentagemDeLucro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra em dolar US$: ");
        double compraEmDolar = sc.nextDouble();

        System.out.print("Digite a taxa de dolar no dia: ");
        double taxaDoDolar = sc.nextDouble();

        System.out.print("Digite o percentual de ICMS: ");
        double icms = sc.nextDouble();

        System.out.println("Difite o percentual em lucro da emppresa:");
        double lucro = sc.nextDouble();

        // Conversão para reais
        double valorEmReais = compraEmDolar * taxaDoDolar;

        // Cálculo do ICMS e do lucro
        double valorIcms = (icms / 100) * valorEmReais;
        double valorLucro = (lucro / 100) * valorEmReais;

        // Cálculo do valor final com ICMS e lucro
        double valorFinal = valorEmReais + valorIcms + valorLucro;

        sc.close();

    }
}
