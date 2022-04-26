package curso.java.aula16;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean verdade = false;

        do{
            System.out.println("Informe o valor de 1 - 10 ");
            int i =scan.nextInt();
            if(i > 0 && i < 10){
                System.out.println("Você digitou : " + i);
                verdade =true;
            }else{
                System.out.println("Nota inválida !!!");
            }
        }while(!verdade);
    }
}
