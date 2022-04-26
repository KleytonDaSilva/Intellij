package curso.java.aula14;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class
        Decisao {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("É maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }

        System.out.println("Entre com o preço do item: ");
        double valor = scan.nextDouble();

        if(valor <= 10){
            System.out.println("Está barato, pode comprar");
        }else if(valor >= 10  && valor < 15){
            System.out.println("você pode pedir um desconto");
        }else if( valor >= 15 && valor < 17){
            System.out.println("pode pesquisar mais");
        }else{
            System.out.println("Muito caro!!!");
        }

    }
}
