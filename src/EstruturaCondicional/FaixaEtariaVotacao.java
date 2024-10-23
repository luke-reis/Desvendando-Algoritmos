package EstruturaCondicional;

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();


        if (idade < 13) {
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("adolecente");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Você é um adulto(a) jovem");
        } else if(idade >= 31 && idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        sc.close();

    }
}

