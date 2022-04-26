package curso.java.aula19;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for(int i =0; i < vetorA.length; i++){
            System.out.println( i + "°");
            vetorA[i] = scan.nextInt();

        }

        for(int i =0;  i < vetorA.length; i++){

            vetorB[i] = vetorA[i] * i;

        }
        for(int i =0; i < vetorB.length; i++){

            System.out.println(vetorB[i] + " ");
        }
    }
}
