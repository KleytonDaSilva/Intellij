package curso.java.aula19;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[]vetorA= new int[10];
        double[]vetorB= new double[10];

        for(int i=0; i < vetorA.length; i ++){

            System.out.println( i + "°");
            vetorA[i] = scan.nextInt();
        }

        for(int i=0; i < vetorA.length; i ++){

            vetorB[i] =  Math.sqrt(vetorA[i]);
        }

        for(int i =0 ; i < vetorB.length;i++){

            System.out.println(vetorB[i] + " ");
        }

    }
}
