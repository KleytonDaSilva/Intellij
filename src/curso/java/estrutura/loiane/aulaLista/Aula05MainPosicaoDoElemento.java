package curso.java.estrutura.loiane.aulaLista;

public class Aula05MainPosicaoDoElemento {
    public static void main(String[] arg){
        Estrutura_dados_lista vetor = new Estrutura_dados_lista(10);

        vetor.adicionar_boolean("9");
        vetor.adicionar_boolean("8");
        vetor.adicionar_boolean("7");

        System.out.println(vetor.busca(0));
    }
}
