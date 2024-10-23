package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá aluno, por favor se indentifique: ");
        String nomeAluno = sc.nextLine();

        System.out.println();
        System.out.print("Digite a nota da primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da segunda nota:");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota da terceira nota:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2  + nota3)/3;

        if (media >= 7){
            System.out.printf("\nAluno %s você está aprovado, sua media é igual a %.2f ", nomeAluno, media);
        } else {
            System.out.printf("\nAluno %s você está reprovado, sua media é igual a %.2f ", nomeAluno, media);
        }

        sc.close();

    }
}
