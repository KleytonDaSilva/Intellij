package curso.java.aula16;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int primeiro = scan.nextInt();

        System.out.println("Informe o segundo número ");
        int segundo = scan.nextInt();

        int total =0;

        for(; primeiro < segundo; primeiro ++){

            total = primeiro + total;

        }

        System.out.println("Soma: " + total);
    }
}
