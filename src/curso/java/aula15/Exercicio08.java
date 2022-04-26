package curso.java.aula15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro Preço: ");
        double pr1 = scan.nextDouble();

        System.out.println("Informe o segundo Preço: ");
        double pr2 = scan.nextDouble();

        System.out.println("Informe o terceiro Preço: ");
        double pr3 =  scan.nextDouble();

        if(pr1 < pr2 && pr1 < pr3){
            System.out.println("primeiro valor é mais barato " + pr1);
        }else if(pr2 < pr1 && pr2 < pr1) {
            System.out.println("Segunda valor é mais barato " + pr2);
        }else if (pr3 < pr1 && pr3 < pr2){
                System.out.println("terceiro valor é mais barato " + pr3);
            }
        }

    }

