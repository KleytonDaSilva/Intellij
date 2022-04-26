package curso.java.aula19;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[8];
        int [] vetorB = new int[8];

        for(int i =0; i < vetorA.length; i ++){

            System.out.println("Informe os elemntos: " + i);
            vetorA[i] = scan.nextInt();
        }
        for(int i =0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * 2;

        }

        System.out.println("Vetor B = ");
        for(int i=0; i < vetorB.length; i ++){

            System.out.println(vetorB[i] + " ");
        }
    }
}
