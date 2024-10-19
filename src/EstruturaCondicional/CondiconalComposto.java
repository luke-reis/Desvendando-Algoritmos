package EstruturaCondicional;

import java.util.Scanner;


//Isso é apenas um codigo fonte vai ser descartodo no futuro

public class CondiconalComposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tesando condicional composto");

        System.out.println();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.print("Você pode entrar na festa divirta-se :)");
        } else {
            System.out.print("Vai para casa menó não tem nada pra tu aqui   (͡° ͜ʖ ͡°) ");
        }

        sc.close();
    }
}
