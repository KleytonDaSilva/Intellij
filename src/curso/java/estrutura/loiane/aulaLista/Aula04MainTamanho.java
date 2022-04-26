package curso.java.estrutura.loiane.aulaLista;

public class Aula04MainTamanho {
    public static void main(String[]arg) throws Exception {
        Estrutura_dados_lista vetor = new Estrutura_dados_lista(5);
        // ------------------------------------------ aula 04 - tamanho e elementos do vetor
        vetor.adiciona_novo("8");
        vetor.adiciona_novo("9");
        vetor.adicionar_boolean("10");


        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }
}
