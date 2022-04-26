package curso.java.aula16;

import java.util.Scanner;

public class Exercicio08 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int numero =0;
        int total = 0;
        int i =0;

        for(; i < 5; i ++){

            System.out.println("Informe a = " + i +"° número");
            numero = scan.nextInt();

            total = total + numero;
        }

        System.out.println("Média: " + total / i);

    }
}
