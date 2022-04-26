package curso.java.aula20;

import com.sun.security.jgss.GSSUtil;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Exercicio05 {
    public  static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[][][] compromisso = new String[12][31][24];
        boolean sair = false;
        byte opcao;

        while(!sair){

            System.out.println("Digite 1 para adicionar compromisso: ");
            System.out.println("Digite 2 para verifcar compromisso: ");
            System.out.println("Digite 0 para Sair do sistema: ");

            opcao = scan.nextByte();

            if(opcao == 1){
                boolean mesValida = false;
                int mes =0;
                while(!mesValida){
                    System.out.println("Entre com o Mês: ");
                    mes = scan.nextInt();

                    if(mes > 0 && mes <= 12){
                        mesValida = true;
                    }else{
                        System.out.println("Mês inválido, digite novamente: ");
                    }
                }

                boolean diaValida = false;
                int dia=0;
                while(!diaValida){
                    System.out.println("Entre com o Dia: ");
                    dia = scan.nextInt();

                    if(dia > 0 && dia <= 31){
                        diaValida = true;
                    }else{
                        System.out.println("Dia inválido, digite novamente: ");
                    }
                }
                boolean horavalida = false;
                int hora=0;
                while(!horavalida){

                    System.out.println("Entre com a hora: ");
                    hora = scan.nextInt();

                    if(hora > 0 && hora <= 24){
                        horavalida = true;
                    }else{
                        System.out.println("Hora inválida, digite novamente: ");
                    }
                }
                dia --;
                mes --;
                System.out.println("Digite compromisso: ");
                compromisso[mes][dia][hora] = scan.next();

            }else if(opcao == 2){
                boolean mesValido = false;
                int mes =0;
                while(!mesValido){

                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();

                    if(mes > 0 && mes <= 12){
                        mesValido = true;
                    }else{
                        System.out.println("Mês inválido, digite novamente: ");
                    }
                }

                boolean diaValido = false;
                int dia =0;
                while(!diaValido){

                    System.out.println("Entre com o dia: ");
                    dia = scan.nextInt();

                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    }else{
                        System.out.println("Dia inválido, digite novamente: ");
                    }
                }

                boolean horaValida = false;
                int hora =0;
                while(!horaValida){

                    System.out.println("Entre com a hora: ");
                    hora = scan.nextInt();

                    if(hora > 0 && hora <= 24 ){
                        horaValida = true;
                    }else{
                        System.out.println("Hora inválida, digite novamente: ");
                    }
                }
                dia --;
                mes --;

                System.out.println("O compromisso agendado: ");
                System.out.println(compromisso[mes][dia][hora]);
            }else if( opcao == 0){
                sair = true;
            }else{
                System.out.println("Opção Inválida, digite novamente !!!" );
            }
        }
    }
}
