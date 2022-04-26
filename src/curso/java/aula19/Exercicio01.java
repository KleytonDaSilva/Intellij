package curso.java.aula19;

import java.util.Scanner;

public class Exercicio01 {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int [5];
        int[] vetorB = new int [5];

        for(int i =0; i < vetorA.length; i ++){
            System.out.println("Informe 5 elementos: " + i );
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor A = ");
        for(int i =0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("Vetor B =  " );
         for(int i =0; i < vetorB.length; i ++){
             System.out.println(vetorB[i] + " ");
         }
        System.out.println();

    }
}
