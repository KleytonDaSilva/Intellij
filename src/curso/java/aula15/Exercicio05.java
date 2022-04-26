package curso.java.aula15;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double pNota = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double sNota = scan.nextDouble();

        double media = (pNota + sNota) / 2;

        if(media == 10){
            System.out.println("Aprovado  com distinção" + media);
        }else if ( media >=7 ){
            System.out.println("Aprovado!!" + media);
        }else{
            System.out.println("Reprovado !!! " + media);
        }
    }
}
