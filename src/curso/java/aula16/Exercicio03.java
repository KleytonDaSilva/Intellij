package curso.java.aula16;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean inforValidade = false;

        String nome;

        do{
            System.out.println("Informe seu nome: ");
            nome = scan.next();

            // length ele conta letra por letra

            if(nome.length() >= 3){
                inforValidade = true;

            }else{
                System.out.println("Precisa de mais de 3 letras !!!");
            }
        }while(!inforValidade);

        int anos;

                do{
                    System.out.println("Informe sua idade : ");
                    anos = scan.nextInt();

                    if(anos > 0 && anos < 150){
                        inforValidade = true;
                    }else{
                        System.out.println("Idade Invalida !!!");
                    }
                }while(!inforValidade);

        double salario;

        do{
            System.out.println("Informe  o salario : ");
            salario = scan.nextDouble();

            if(salario > 0.0){
                inforValidade = true;
            }else{
                System.out.println("Salaria invalido !!!");
                inforValidade = false;
            }
        }while(!inforValidade);

        String sexo;

        do{
            System.out.println("Informe o sexo M para masculino e F para feminino");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") ){
                inforValidade = true;
            }else{
                System.out.println("Sexo inválido !!!, Informe o sexo, M para masculino e F para feminino");
                inforValidade = false;
            }
        }while(!inforValidade);
        String estadoC;
        do{
            System.out.println("Informe estado civil,S solteiro, C casado, V viuva(o), D divorciado ");
            estadoC = scan.next();

            if(estadoC.equalsIgnoreCase("s") || estadoC.equalsIgnoreCase("c") ||
            estadoC.equalsIgnoreCase("v") || estadoC.equalsIgnoreCase("d")){
                inforValidade = true;
            }else{
                System.out.println("Opção invalida!!!");
                inforValidade = false;
            }
        }while(!inforValidade);

        System.out.println("Informações: \n");
        System.out.println("\n" + " Nome: " + nome);
        System.out.println("\n" + " Idade: " + anos);
        System.out.println("\n" + " Salario: " + salario);
        System.out.println("\n" + " Sexo: " + sexo);
        System.out.println("\n" + " Estado Civil: " + estadoC);
    }
}
