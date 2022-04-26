package curso.java.aula15;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro  numero: ");
        int primeiro = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int segundo = scan.nextInt();

        System.out.println("Informe o terceiro número: ");
        int terceiro =  scan.nextInt();


        if(primeiro > segundo && primeiro > terceiro) {
            System.out.println("Maior = " + primeiro);
        }else if(segundo >  primeiro && segundo > terceiro){
            System.out.println("Maior = " + segundo);
        }else if(terceiro > primeiro && terceiro > segundo) {
            System.out.println("Maior = " + terceiro);
        }
    }
}
