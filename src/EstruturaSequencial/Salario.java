package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número do colaborador:");
        int numeroId = sc.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que o colaborador recebe por hora: ");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas*valorPorHora;

        System.out.println();
        System.out.println("NUMBER = " + numeroId);
        System.out.printf("SALARY = %.2f%n ", salario);
        sc.close();

    }
}
