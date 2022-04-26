package curso.java.aula16;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean verdadeiro = false;
        do{
            System.out.println("Informe seu nome: ");
            String nome = scan.next();

            System.out.println("Informe sua senha: ");
            String senha = scan.next();

            //equalsIgnoreCase ele compara duas string, não é case-sentive

            if(nome.equalsIgnoreCase(senha)){
                System.out.println("Senha Invalida!!");
                verdadeiro = true;
            }else{
                verdadeiro = false;
                System.out.println("senha valida !!");
            }
        }while( verdadeiro == true);
    }
}
