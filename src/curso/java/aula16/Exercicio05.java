package curso.java.aula16;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do País A");
        int paisA = scan.nextInt();

        System.out.println("Informe o valor do País B");
        int paisB = scan.nextInt();


        int anos =0;

        while(paisA < paisB){

            paisA += (paisA/100) * 3;
            paisB += (paisB/100) * 1.5;

            anos ++;
        }

        System.out.println("País A: " + paisA);
        System.out.println("País B: " + paisB);
        System.out.println("Anos : " + anos);

    }
}
