package curso.java.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sca.nextLine();

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = sca.next();

        System.out.println("Digite sua idade: ");
        int idade = sca.nextInt();


        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);

    }
}
