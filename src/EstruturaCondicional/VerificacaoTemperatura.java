package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius");
        double temperaturaCelsius = sc.nextDouble();

         if ( temperaturaCelsius < 10 ){
             System.out.print("Muito frio");
         } else if (temperaturaCelsius >= 10 &&  temperaturaCelsius <= 15) {
             System.out.print("Frio");
         } else if (temperaturaCelsius >= 16 && temperaturaCelsius <= 25) {
             System.out.print("Agradavel");
         } else if (temperaturaCelsius >= 26 && temperaturaCelsius <= 30) {
             System.out.println("Quente");
         } else {
             System.out.println("Muito quente");
         }

         sc.close();


    }

}
