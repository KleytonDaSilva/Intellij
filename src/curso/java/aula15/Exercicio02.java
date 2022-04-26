package curso.java.aula15;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número ");
        int primeiro = scan.nextInt();

        if(primeiro >=0 ){
            System.out.println("positivo!!");
        }else{
            System.out.println("negativo!!");
        }
    }
}
