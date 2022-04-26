package curso.java.aula19;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[]  args){

        Scanner scan = new Scanner(System.in);

        int[] vetA = new int[5];
        int cont = 0;

        System.out.println("Informa 5 valores");
        for(int i =0; i < vetA.length; i++){
            System.out.println(i + "° valor");
            vetA[i] = scan.nextInt();

        }

        for(int i =0; i < vetA.length; i ++){

            if(vetA[i] % 2 ==0){

                cont ++;
            }
        }

        System.out.println("Quantidade de n° par: " + cont);
    }
}
