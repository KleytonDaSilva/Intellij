package faculdade.programacao.estrutura.lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int tamanhoLista = 0;
        int elemento;

        //SEGUIR A FORMA DO USUARIO PARA MEXER COM LISTA, DA ORDEM DE 1 ATÉ N

        ListaEstatica listaEstatica1 = new ListaEstatica();
        ListaEstatica listaEstatica2 = new ListaEstatica();

        //LEITURA PARA INFORMAR O TAMANHO MÁXIMO DAS LISTAS
        Scanner lerInteiro = new Scanner(System.in);
        System.out.printf("Informe o tamanho máximo das listas : ");
        tamanhoLista = lerInteiro.nextInt();

        //LEITURA DA PRIMEIRA LISTA
        System.out.println("Leitura da primeira lista");
        for( int i = 1 ; i <= tamanhoLista ; i++){
            System.out.print("Informe o " + i + " elemento : ");
            elemento = lerInteiro.nextInt();
            listaEstatica1.insereElementoNoInicio(elemento);
        }

        //LEITURA DA SEGUNDA LISTA
        System.out.println("Leitura da segunda lista");
        for( int i = 1 ; i <= tamanhoLista ; i++){
            System.out.print("Informe o " + i + " elemento : ");
            elemento = lerInteiro.nextInt();
            listaEstatica2.insereElementoNoInicio(elemento);
        }

        //MOSTRANDO AS DUAS LISTAS
        System.out.print("Lista 1 : "); listaEstatica1.exibirLista();
        System.out.print("Lista 2 : "); listaEstatica2.exibirLista();

        //VERIFICA OS ELEMENTOS IGUAIS DENTRO DO VETOR
        System.out.print("Elementos iguais nas listas na mesma posicao : ");
        System.out.print("[");
        for(int i=1 ; i <= tamanhoLista ; i++){
            if(listaEstatica1.recuperaElementoDaLista(i) == listaEstatica2.recuperaElementoDaLista(i)){
                System.out.print(listaEstatica1.recuperaElementoDaLista(i));
                if(i != tamanhoLista){
                    System.out.print(",");
                }
            }
        }
        System.out.println("]");
    }
}
