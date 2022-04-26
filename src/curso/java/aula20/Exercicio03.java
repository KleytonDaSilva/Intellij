package curso.java.aula20;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){

        int[][] matriz  = new int[3][3];
        Scanner scan = new Scanner(System.in);

        int impar =0;
        int par =0;

        for(int l=0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c++){

                System.out.println("Informe os números da Matriz : " );
                matriz[l][c] = scan.nextInt();

            }
        }

        for(int l =0; l < matriz.length; l ++){
            for(int c=0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c]);
            }
            System.out.println();
        }

        for(int l=0; l < matriz.length; l++){
            for(int c=0; c <matriz[l].length; c++){

                if(matriz[l][c] % 2 == 0){
                    par ++;
                }else{
                    impar++;
                }
            }
        }

        System.out.println(" Quantidades de números pares: " + par);
        System.out.println("Quantidades de números impares: " + impar);

    }
}
