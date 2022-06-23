package curso.java.aula25;

import java.util.Scanner;

public class MainExercicios {
    public static void main(String[] args){
        //-----------------------------------------------------------------------------EXERCICIO01
        System.out.println("-----------------------------------------------------------Exercicio01");
        ContaBancariaExercicio01 lampadas =  new ContaBancariaExercicio01();

        lampadas.tipoLampada = "led";
        lampadas.temperatura = 500;
        lampadas.vidaUtil = 5000;
        lampadas.rendimentoLuminoso = 4500;
        lampadas.temperaturaCor = 6000;


        lampadas.ligar();
        lampadas.mostrarEstado();
        lampadas.mudarEstado();

        System.out.println("Tipo de Lampada: " + lampadas.tipoLampada);
        System.out.println("Temperatura: " + lampadas.temperatura);
        System.out.println("Vida Útil " + lampadas.vidaUtil);
        System.out.println("Rendimento Luminoso: " + lampadas.rendimentoLuminoso);
        System.out.println("Temperatura  da cor " + lampadas.temperaturaCor);
        System.out.println("Lampada ligada: " + lampadas.ligada);
//------------------------------------------------------------------------------------------------------EXERCICIO02
        System.out.println("----------------------------------------------------------------------------Exercicio02");

        Exercicio02 contaBanco = new Exercicio02();

        contaBanco.conta = 123456;
        contaBanco.agencia = 5544655;
        contaBanco.saldo = 5000;
        contaBanco.limiteEspecial = 2000;
        contaBanco.valorEspecialUsado = 0;

        boolean saqueEfetuado = contaBanco.realizarSaque(5000);

        System.out.println("Conta: " + contaBanco.conta);
        System.out.println("Agencia: " + contaBanco.agencia);

        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso: ");
        }else{
            System.out.println("Não fou possivel realaizar saque. Saldo insuficiente ");
        }

        contaBanco.depositarDinheiro(450);
        contaBanco.consultarSaldo();

        if(contaBanco.verificarUsoChequeEspecial()){
            System.out.println("Usado Cheque especial");
        }else{
            System.out.println("Não está usando cheque especial");
        }

       // -----------------------------------------------------------------------------------------------EXERCICIO03
        System.out.println("-----------------------------------------------------------------------------Exercicio03");

        Scanner scan = new Scanner(System.in);

        Exercicio03 aluno = new Exercicio03();
        System.out.println("Nome do aluno: ");
        aluno.nome = scan.next();
        System.out.println("Nome do Curso: ");
        aluno.curso = scan.next();
        System.out.println("Matricula: ");
        aluno.matricula = scan.next();

        aluno.disciplina= new String[3];
        for(int i =0; i < aluno.disciplina.length; i ++){
            System.out.println("Nome da Disciplina: ");
            aluno.disciplina[i] = scan.next();
        }
        for(int i=0; i < aluno.notas.length; i++){
            System.out.println("Notas: " + aluno.disciplina[i]);
            for(int j=0; j < aluno.notas[i].length; j++){
                System.out.println("Notas ");
                aluno.notas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostrarInfo();

    }

}

