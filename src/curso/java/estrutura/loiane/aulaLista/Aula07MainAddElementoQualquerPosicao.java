package curso.java.estrutura.loiane.aulaLista;

import jdk.swing.interop.SwingInterOpUtils;

public class Aula07MainAddElementoQualquerPosicao {
    public static void main(String [] args){
        Estrutura_dados_lista vetor = new Estrutura_dados_lista(10);


        vetor.adicionar_boolean("B");
        vetor.adicionar_boolean("C");
        vetor.adicionar_boolean("E");
        vetor.adicionar_boolean("F");
        vetor.adicionar_boolean("G");

        System.out.println(vetor);
        vetor.adicionar_boolean(0,"A");
        System.out.println(vetor);

        vetor.adicionar_boolean(3,"D");
        System.out.println(vetor);


    }
}
