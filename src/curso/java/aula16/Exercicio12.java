package curso.java.aula16;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a tabuada: ");
        int tabuada = scan.nextInt();

        int resultado =0;

        System.out.println("Tabuada de : " + tabuada);

        for(int i =0; i <= 10; i ++){

            resultado = tabuada * i;
            System.out.println(tabuada  + " * " + i + " = " + resultado);
        }
    }
}
