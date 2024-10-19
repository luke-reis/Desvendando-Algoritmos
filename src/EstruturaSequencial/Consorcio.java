package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consorcio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o numero total de prestações");
        double totalPrestacoes = sc.nextDouble();

        System.out.println("Qual a quantidade de prestações pagas");
        double prestacoesPgas = sc.nextDouble();

        System.out.println("O valor autal da prestação");
        double valorAutalPrestacao = sc.nextDouble();

        double totalPago =  prestacoesPgas * valorAutalPrestacao;
        double saldoDevedor = (totalPrestacoes*valorAutalPrestacao) - totalPago;

        System.out.printf("O concorciado já pagou %.3f R$",totalPago);
        System.out.printf("O concorciado ainda está devendo %.3f  R$",saldoDevedor);
        sc.close();
    }
}
