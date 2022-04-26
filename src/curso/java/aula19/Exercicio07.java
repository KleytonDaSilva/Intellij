package curso.java.aula19;

import java.util.Scanner;

public class Exercicio07 {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        System.out.println(" Vetor A : ");
        for(int i=0; i < vetorA.length; i++){

            System.out.println(i + "°");
            vetorA[i] = scan.nextInt();

        }

        System.out.println("VetorB : ");
        for(int i =0; i < vetorB.length; i++){

            System.out.println(i + " ° ");
            vetorB[i] = scan.nextInt();
        }

        for(int i=0; i < vetorC.length; i++){

            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Vetor C : ");
        for(int i=0; i < vetorC.length; i++){

            System.out.println(vetorC[i] + " ");
        }
    }
}
