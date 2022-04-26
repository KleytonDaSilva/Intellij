package curso.java.aula20;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args){

        int[][] matriz = new int[4][4];

        Random numeroRandom = new Random();

        for(int l=0; l < matriz.length; l ++){
            for(int c=0; c < matriz[l].length; c++){

                matriz[l][c] = numeroRandom.nextInt(100);

            }
        }

        int maior =0;
        //ou pode usar int maior =  Integer.MIN_VALUES;
        int coluna =0;
        int linha = 0;

        for(int l=0; l < matriz.length; l ++){
            for(int c=0; c < matriz[l].length; c++){
                if(matriz[l][c] > maior){
                    maior = matriz[l][c];
                    linha = l;
                    coluna = c;
                }
            }
        }

        for(int l=0; l < matriz.length; l ++){
            for(int c=0;c < matriz[l].length; c++){
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
