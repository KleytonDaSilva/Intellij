package Intellij.src.curso.java.aula20;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 5;
        notasAlunos[1][2] = 6.4;
        notasAlunos[1][3] = 9.1;

        notasAlunos[2][0] = 3.6;
        notasAlunos[2][1] = 5.6;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 9.5;

        for(int l=0; l < notasAlunos.length; l ++){
            for(int c=0; c < notasAlunos[l].length; c++){

                System.out.print(notasAlunos[l][c] + " ");
            }
            // quebrar a linha
            System.out.println();
        }
        // mudança de notas
        notasAlunos[1][3] =8;

        System.out.println();

        for(int l=0; l < notasAlunos.length; l ++){
            for(int c=0; c < notasAlunos[l].length; c ++){

                System.out.print(notasAlunos[l][c] + " - ");
            }

            // quebra linha
            System.out.println();
        }
        // média do aluno
        System.out.println("Calculando a méddio dos alunos : ");
        double soma;
        for(int l=0; l < notasAlunos.length; l ++){
            soma =0;
            for(int c=0; c < notasAlunos[l].length; c++){

                soma += notasAlunos[l][c];
            }
            System.out.println("Média do aluno: " + l + " é: " + (soma / 4));
        }

        //Matriz multidimensional
        int[][][] matriz = new int[3][3][3];

        for(int l =0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c ++){
                for(int z=0; z < matriz[l][c].length; z ++){

                    matriz [l][c][z] = l + c + z;
                }
            }
        }

        int soma1=0;
        int somaPres =0;
        int somaImpares=0;
        for(int l=0; l < matriz.length; l ++){
            for(int c=0; c < matriz[l].length; c++){
                for(int z=0; z < matriz[l][c].length; z++){

                    System.out.println(" l = " + l + " c = " + c + " z = " + z);
                    soma1 += matriz[l][c][z];

                    if(matriz[l][c][z] % 2 ==0){
                        somaPres += matriz[l][c][z];
                    }else{
                        somaImpares += matriz[l][c][z];
                    }
                }
            }
        }

        System.out.println("Soma total: " + soma1);
        System.out.println("Soma dos Pares " + somaPres);
        System.out.println("Soma dos Impares " + somaImpares);

        // Matriz irregulares

        System.out.println("Entre comnúmero de pessoas entrevistadas: ");
        int numEntrevistado = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistado][];

        for(int l=0; l < nomesFilhos.length; l ++){
            System.out.println(" Qautnidade de filhos: ");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[l] = new String[qtdFilhos];

            for(int c=0; c < nomesFilhos.length; c++){

                System.out.println("Digite o nome do filho " + (c + 1));

                nomesFilhos[l][c] = scan.next();
            }
        }

        for(int l=0; l < nomesFilhos.length; l++){
            System.out.println("Pessoa " + l + " tem " + nomesFilhos[l].length + " filhos");
            for(int c=0; c < nomesFilhos[l].length; c ++){

                System.out.println(nomesFilhos[l][c]);
            }
        }
    }
}
