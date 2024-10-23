package EstruturaCondicional;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, por favor informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Agora informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe seu gênero (M - Masculino) ou (F - Feminino): ");
        String genero = sc.next();


        int idadeHome = 65 - idade;
        int idadeMulher = 60 - idade ;


        if (idade == 14 && genero.equals("M") ){
            System.out.println( nome + " você é menor de idade sob a lei mas pode trablhar como jovem aprendiz, falta cerca de " + idadeHome + " anos para se aposentar");
        } else if(idade == 14 && genero.equals("F")) {
            System.out.println( nome + " você é menor de idade sob a lei mas pode trablhar como jovem aprendiz, falta cerca de " + idadeMulher + " anos para se aposentar");
        } else if(idade >= 18 && genero.equals("M")) {
            System.out.println(nome + " você é maior de idade já podendo trabalhar sob o regime celista falta cerca de " + idadeHome + " anos para se aposentar");
        } else if(idade >= 18 && genero.equals("F")) {
            System.out.println(nome + " você é maior de idade já podendo trabalhar sob o regime celista falta cerca de " + idadeHome + " anos para se aposentar");
        } else {
            System.out.println(nome + " você é menor de idade sob a lei é não pode trabalhar ainda");
        }

        sc.close();

    }
}

