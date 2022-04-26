package curso.java.aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário do colobarador");
        int salario = scan.nextInt();

        if (salario < 280) {

            int aumento = (int) (salario * 0.20 +salario);
            System.out.println("Novo salario " + aumento);
            System.out.println("20% de aumento");
        }else if (salario > 280 && salario <  700){

            int aumento = (int) (salario * 0.15 + salario );
            System.out.println("Novo salario: " + aumento);
            System.out.println("15% de aumento ");

        }else if (salario > 700 && salario < 1500){

            int aumento = (int)  ( salario * 0.10 + salario );
            System.out.println("Novo salario " + aumento);
            System.out.println("10% de aumento" );
        }else if(salario > 1500){

            int aumento = (int) (salario * 0.05 + salario);
            System.out.println("Novo salario: " + aumento);
            System.out.println("5% de aumento");
        }

        System.out.println("Salario antigo: " + salario);
    }
}
