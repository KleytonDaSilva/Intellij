package curso.java.estrutura.loiane.aulaLista;

public class Aula10MainVetorGenerico {
    public static void main(String[] args){
    ClasseGenerica vetor  = new ClasseGenerica(3);

    vetor.adicionar_boolean("3");
    vetor.adicionar_boolean("4");
    vetor.adicionar_boolean("4");

    System.out.println("Tamnho = " + vetor.tamanho());
    System.out.println(vetor);
    
   }
}
