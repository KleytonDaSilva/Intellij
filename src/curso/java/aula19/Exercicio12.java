package curso.java.aula19;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[5];
        int vetB =0;

        System.out.println("Informe os elementos do vetor: ");
        for(int i=0; i < vetA.length; i ++){

            System.out.println(i + "° valor ");
            vetA[i] = scan.nextInt();

        }

        for(int i=0; i < vetA.length ; i ++){

            vetB = vetB + vetA[i];
        }

        System.out.println("Valor: "+ vetB + " ") ;
    }
}
