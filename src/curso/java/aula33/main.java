package curso.java.aula33;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// overload -  sobrecarga ou overload é criar mais de um metodo que tenho o mesmo nome tbm tem overload no construtor
public class main {
    public static void main(String[] arg) {

        MinhaCalculadora cal = new MinhaCalculadora();

        cal.soma(1, 2);
        cal.soma(1.2, 2);
        cal.soma(3, 9, 8);
        cal.soma(10, 8);

        System.out.println("-----------------------------------------------------------Exercicio01");

        Exercicio01 exer01 = new Exercicio01(false);

        System.out.println("A lâmpada está : " + exer01.isStatus());


        System.out.println("-----------------------------------------------------------Exercicio02");

        Scanner scan = new Scanner(System.in);
        Exercicio02 exer02 = new Exercicio02();
        int resposta = 1;

            while(resposta == 1) {
                System.out.println("-----------------Escolha uma opção:   --------------------");
                System.out.println("-----------------1) Deposito          --------------------");
                System.out.println("-----------------2) Saque             --------------------");
                System.out.println("-----------------3) Consulta de saldo --------------------");


                int opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Informe o valor depositado: ");
                        exer02.setDeposito(200);
                        double total = exer02.depositar();
                        break;
                    case 2:
                        System.out.println("Informar Saque: ");
                        exer02.setSaque(150);
                        double total2 = exer02.sacar();
                        break;
                    case 3:
                        System.out.println("Seu saldo é: ");
                        exer02.consultarSaldo();
                        break;
                    default:
                        System.out.println("Você digitou uma opção inválida ");
                }
                System.out.println("Deseja realizar outra operação? 1 (sim) 2 (não)");
                resposta = scan.nextInt();
                if (resposta != 1){
                    System.out.println("Finalizado com sucesso!");
                }
            }

        System.out.println("--------------------------------------------------------------Exercicio03");
       Exercicio03 aluno1 = new Exercicio03();

        System.out.println("Entre com o nome do aluno:");
        aluno1.setNome(scan.next());

        System.out.println("Entre com Matricula: ");
        aluno1.setMatricula(scan.nextInt());

        System.out.println("Entre com nome do curso: ");
        aluno1.setCurso(scan.next());

        for(int i =0; i < aluno1.getDisciplina().length ; i ++){
            System.out.println("Entre com Disciplina: ");
             aluno1.setDisciplinaPosicao(i , scan.next());
        }
        for(int i =0; i < aluno1.getNotas().length; i ++ ){
            System.out.println("Informe a Nota: " + aluno1.getCurso());
            for(int j = 0; j <  aluno1.getNotas()[i].length; j ++){
                System.out.println("Entre com a nota " + (j + 1));
                aluno1.setNomePosIJ(i , j, scan.nextDouble());

            }
        }


    }
}
