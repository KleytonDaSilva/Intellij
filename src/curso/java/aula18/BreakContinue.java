package curso.java.aula18;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int numero = scan.nextInt();

        System.out.println("Entre com um limite");
        int limite = scan.nextInt();

        for(int i= numero; i < limite; i ++){

            if( i % 7 ==0){
                System.out.println("O Valor de i é: " + i);
                break; // break sai do for
            }
        }

        System.out.println("----------------------------------------------------------------------------------");


        for (int i=0 ; i <= 4 ; i++){

            rotulo1:{
                rotulo2:{
                    rotulo3:{

                        if(i == 1){
                            break rotulo1;
                        }
                        if( i == 2) {
                            break rotulo2;
                        }
                        if( i == 3){
                            break rotulo3;
                        }
                        System.out.println(" Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Entre com um número: ");
        int num =  scan.nextInt();

        System.out.println("Entre com limite: ");
        int lim = scan.nextInt();

        for( int i = numero; i < lim;  i ++){

            if( i % 7 ==0 ){
                continue;
            }
            System.out.println("Valor de i é: " + i);
        }
    }
}
