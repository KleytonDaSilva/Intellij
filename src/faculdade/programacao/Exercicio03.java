package faculdade.programacao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String [] args){
        int vetor[] = new int[10];
        Scanner scan = new Scanner(System.in);

        for(int i =0;i < 8; i ++){
            System.out.println("A=[ "+ i +" ] = " );
            vetor[i]= scan.nextInt();
        }
        System.out.println();

        for(int i =0; i < 8; i ++){
            System.out.println("A=[ "+ i +" ] = " + vetor[i]);
        }
    }
}
