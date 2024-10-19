package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ValorFinalDeCorrida {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int TAXA_INCIAL = 4;
        final int TAXA_POR_QUILOMETRO_RODADO = 4;
        final int TAXA_POR_MINUTO_DE_ESPERA= 4;

        System.out.print("Calculando preço da corrida");

        System.out.println("");
        System.out.print("Digite a distância pecorrida pelo táxi:");
        double distanciaPecorrida = sc.nextDouble();

        System.out.print("Digite o tempo de espera do táxi:");
        double tempoDeEspera = sc.nextDouble();

        double valorFnal = TAXA_INCIAL + (distanciaPecorrida*TAXA_POR_QUILOMETRO_RODADO)
        + (tempoDeEspera*TAXA_POR_MINUTO_DE_ESPERA);

        System.out.println();
        System.out.printf("O valor final da corrida é de %.2f reais", valorFnal);
        sc.close();

    }
}
