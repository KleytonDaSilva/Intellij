package curso.java.estrutura.loiane.aulaLista;

public class Aula03MainAdicionar {
    public static void main(String[] arg){
        Estrutura_dados_lista vetor1 = new Estrutura_dados_lista(5);
        //--------------------------------------------aula 3 - adicionar os elementos;

        //primeira opção
        vetor1.adiciona("01");

      

        //segunda opção
        try{
            vetor1.adiciona_novo("3");
            vetor1.adiciona_novo("4");

        }catch(Exception e) {
            e.printStackTrace();
        }

        vetor1.adicionar_boolean("6");
        vetor1.adicionar_boolean("7");
    }
}
