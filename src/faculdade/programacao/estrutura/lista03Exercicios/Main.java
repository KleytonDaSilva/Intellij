package faculdade.programacao.estrutura.lista03Exercicios;

import faculdade.programacao.estrutura.lista2.Lista;

import java.util.List;

public class Main {
    public static void main(String[] arg){
        ListaEstaticaGenerica<String> listaNome; listaNome = new ListaEstaticaGenerica<>(10);
        listaNome.insereNoFinal("jose");
        listaNome.insereNoFinal("PEDRO");
        listaNome.insereNoFinal("Kleyton");

        System.out.println(listaNome);

        ListaEstaticaGenerica<Integer> listaIdade; listaIdade = new ListaEstaticaGenerica<>(5);

        listaIdade.insereNoFinal(22);
        listaIdade.insereNoFinal(35);
        listaIdade.insereNoFinal(35);

        System.out.println(listaIdade);
    }
}
