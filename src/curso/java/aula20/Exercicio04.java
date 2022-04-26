package curso.java.aula20;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[][] compromisso = new String[31][24];
        boolean sair = false;
        byte opcao;
        while(!sair){

            System.out.println("Digite 1 para adicionar compromisso: ");
            System.out.println("Digite 2 para verificar compromisso: ");
            System.out.println("Digite 0 para sair do ssitema: ");

            opcao = scan.nextByte();

            if(opcao == 1){ // adicionar o compromisso
                boolean diaValido = false;
                int dia =0;
                while(!diaValido){
                    System.out.println("Entre com dia do mês: ");
                    dia = scan.nextInt();

                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    }else{
                        System.out.println("Dia inválido, Digite Novamente: ");
                    }
                }
                boolean horaValida = false;
                int hora =0;
                while(!horaValida){

                    System.out.println("Entre com a Hora: ");
                    hora = scan.nextInt();

                    if(hora > 0 && hora <=24){
                        horaValida = true;
                    }else{
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                dia--;
                System.out.println("Digite o compromisso: ");
                compromisso[dia][hora] = scan.next();

            }else if(opcao == 2){// verificar os compromissos
                boolean  diaValido = false;
                int dia= 0;
                while(!diaValido){
                    System.out.println("Entre com dia do mês");
                    dia = scan.nextInt();

                    if(dia > 0 && dia <= 31){
                        diaValido = true;
                    }else{
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora =0;
                while(!horaValida){
                    System.out.println("Entre com as horas: ");
                    hora = scan.nextInt();

                    if(hora > 0 && hora <= 24){
                        horaValida = true;
                    }else{
                        System.out.println("Hora inválida, digite novamente: ");
                    }
                }
                dia --;
                System.out.println("O compromisso agendado: ");
                System.out.println(compromisso[dia][hora]);
            }else if(opcao ==0) {
                sair = true;     // sair do sistema
            }else{
                System.out.println("Opção inválida, Digite novamente ");
            }
        }
    }
}
