package curso.java.aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salario bruto: ");
        double salario = scan.nextDouble();

        double inss =  salario * 0.10;
        double fgts = salario * 0.11;

        if(salario < 900){
            System.out.println("Salario bruto : " + salario);
            System.out.println("IR, isento !!!");
            System.out.println("INSS : " + inss);
            System.out.println("FGTS : " + fgts);
            System.out.println("Total de desconto: " + (inss + fgts));
            System.out.println("Salario Liquido: " + (salario - inss - fgts));
        }else if( salario > 900 && salario < 1500){
            double ir = salario * 0.05;
            System.out.println("Salario bruto : " + salario);
            System.out.println("IR : " + ir);
            System.out.println("INSS : " + inss);
            System.out.println("FGTS : " + fgts);
            System.out.println("Total de desconto: " + (inss + fgts));
            System.out.println("Salario Liquido: " + (salario - inss - fgts - ir));
        }else if(salario > 1500 && salario < 2500){
            double ir = salario * 0.10;
            System.out.println("Salario bruto : " + salario);
            System.out.println("IR : " + ir);
            System.out.println("INSS : " + inss);
            System.out.println("FGTS : " + fgts);
            System.out.println("Total de desconto: " + (inss + fgts));
            System.out.println("Salario Liquido: " + (salario - inss - fgts - ir));
        }else if(salario > 2500){
            double ir = salario * 0.20;
            System.out.println("Salario bruto : " + salario);
            System.out.println("IR : " + ir);
            System.out.println("INSS : " + inss);
            System.out.println("FGTS : " + fgts);
            System.out.println("Total de desconto: " + (inss + fgts));
            System.out.println("Salario Liquido: " + (salario - inss - fgts - ir));
        }
    }
}
