package curso.java.estrutura.loiane.aulaLista;

import javax.sound.sampled.SourceDataLine;

public class Aula09MainRemoverElementos {

    public static void main(String[] args) {
        Estrutura_dados_lista vetor2 = new Estrutura_dados_lista(3);

        vetor2.adicionar_boolean("B");
        vetor2.adicionar_boolean("C");
        vetor2.adicionar_boolean("E");
        vetor2.adicionar_boolean("F");
        vetor2.adicionar_boolean("G");

        System.out.println(vetor2);

        vetor2.remove(1);
        System.out.println(vetor2);

        // Removendo o elementos fazendo uma busca

        System.out.println("Removendo o elemento E");
        int pos = vetor2.existe("E");
        if (pos > -1) {
            vetor2.remove(pos);
        } else {
            System.out.println("Não existe esse elemento!");
        }
        System.out.println(vetor2);
    }
}
