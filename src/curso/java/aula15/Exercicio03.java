package curso.java.aula15;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String letra = scan.next();

        switch(letra){
            case "f":
                System.out.println("Feminino");
                break;

            case "m":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido!!");
        }
    }
}
