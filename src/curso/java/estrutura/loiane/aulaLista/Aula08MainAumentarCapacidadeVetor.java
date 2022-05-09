package curso.java.estrutura.loiane.aulaLista;

public class Aula08MainAumentarCapacidadeVetor {
    public static void main(String[] args){
        Estrutura_dados_lista vetor1 = new Estrutura_dados_lista(3);


        vetor1.adicionar_boolean("B");
        vetor1.adicionar_boolean("C");
        vetor1.adicionar_boolean("E");
        vetor1.adicionar_boolean("F");
        vetor1.adicionar_boolean("G");
    
        System.out.println(vetor1);
        vetor1.adicionar_boolean(0,"A");
        System.out.println(vetor1);
    
        vetor1.adicionar_boolean(3,"D");
        System.out.println(vetor1);
    
    
    }
 }
    

