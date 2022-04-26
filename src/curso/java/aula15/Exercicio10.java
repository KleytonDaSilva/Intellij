package curso.java.aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Periodo qu voce estuda");
        String p = scan.next();

        switch (p){
            case "m":
                System.out.println("Bom dia !!!");
                break;
            case "v":
                System.out.println("Boa tarde !!!");
                break;
            case"n":
                System.out.println("Boa noite !!!");
                break;
            default:
                System.out.println("Não existe , valor inválido: ");
        }
    }
}
