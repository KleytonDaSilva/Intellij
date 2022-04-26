package curso.java.aula20;

import java.util.Random;

public class Exercicio02 {
    public static void main (String[] args){

        int [][] matrix = new int[10][10];
        Random numeroRandom = new Random();

        for(int l=0; l < matrix.length; l ++){
            for(int c=0; c < matrix[l].length; c++){

                matrix[l][c] = numeroRandom.nextInt(50);
            }
        }
        int maiorLinha=0;
        int menorLinha=100;
        int linha5 = 5;

        for(int l=0;l < matrix[linha5].length; l ++){

            if(matrix[linha5][l] > maiorLinha){
                maiorLinha = matrix[5][l];
            }
            if(matrix[linha5][l] < menorLinha){

                menorLinha = matrix[5][l];
            }
        }

        System.out.println("Maior da linha 5: " + maiorLinha);
        System.out.println("Menor da linha 5: " + menorLinha);

        int maiorColuna =0;
        int menorColuna = 0;
        int coluna7 = 7;

        for(int l=0; l < matrix[coluna7].length;l ++){
            if(matrix[l][coluna7] > maiorColuna){
                maiorColuna = matrix[l][coluna7];
            }
            if(matrix[l][coluna7] <= menorColuna){
                menorColuna = matrix[l][coluna7];
            }
        }

        for(int l=0; l < matrix.length; l++){
            for(int c=0; c < matrix[l].length; c ++){
                System.out.print(matrix[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior da coluna 7: " + maiorColuna);
        System.out.println("Menor da coluna 7: " + menorColuna);
    }
}
