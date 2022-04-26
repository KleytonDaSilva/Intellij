package curso.java.aula16;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for(int i =0; i < 5; i++){
            System.out.println("Informe 5 números diferentes: ");
            int num = scan.nextInt();

            if(num > maior){
                maior = num;
            }
        }

        System.out.println("Maior numero é: " + maior);
    }
}
