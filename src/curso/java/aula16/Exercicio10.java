package curso.java.aula16;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o primeiro número: ");
        int primeiro = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int segundo = scan.nextInt();

        for(; primeiro < segundo; primeiro ++){

            System.out.println(primeiro + "°");
        }
    }
}
