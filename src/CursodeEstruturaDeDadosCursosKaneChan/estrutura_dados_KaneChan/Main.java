package CursodeEstruturaDeDadosCursosKaneChan.estrutura_dados_KaneChan;

import java.util.Scanner;

public class Main {
    /*
     * 
     * Estrutura de dados Heap Vs Stack
     */

    public static void main(String arg[]) {

        Scanner sca = new Scanner(System.in);
        int op;

        System.out.println("***** Gerenciamento de memória *****");
        System.out.println("Informe a opção desejada ");

        op = sca.nextInt();

        switch (op) {
            case 1:
                gerenciarMemoria();
                break;
        }

    }

    private static void gerenciarMemoria() {
        int x = 4;
        System.out.println(x);
        int y = x;
        System.out.println(y);
        System.out.println("-------------------------------");
        System.out.println(x == y);
        System.out.println("***** PESSOA *****");
        Aula02 pes = new Aula02(1, "Kleyton");
        System.out.println(pes); // --->"pes" é o endereço de memoria
        Aula02 pes2 = new Aula02(2, "José");
        System.out.println(pes2);
        System.out.println(pes == pes2);

    }

    //------------------------------------------------------------------------------------------------ Exercicio aula 07
     AulasListaLigadas<PessoalAula07> listapessoas = new AulasListaLigadas<PessoalAula07>();

     
}
