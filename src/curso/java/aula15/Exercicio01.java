package curso.java.aula15;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        int primeiro = scan.nextInt();

        System.out.println("Informe o segundo número");
        int segundo = scan.nextInt();

        if(primeiro > segundo){
            System.out.println("Primeiro número é o maior ");
        }else{
            System.out.println("Segundo número é maior");
        }
    }
}
