package EstruturaCondicional;

import java.util.Scanner;

public class FaixaEtariaVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança, ainda não pode votar");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolecente,não é obrigado(a) a votar porém se quiser fazer isso aos 16 anos");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Você é um adulto(a) jovem, é obrigado(a) a votar");
        } else if(idade >= 31 && idade <= 60) {
            System.out.println("Você é adulto(a), é obrigado(a) a votar ");
        } else {
            System.out.println("Você é um idoso, não obrigado a votar porém pode votar se quiser");
        }

        sc.close();

    }
}

