package faculdade.programacao.estrutura.ListaEstaticaGenerica2;

import javax.xml.transform.Source;

public class Main {
    public static void main(String []args){
        Nodo<String> listaNome; listaNome = new Nodo<>(10);

        listaNome.inserir("Kleyton", 1);
        listaNome.inserir("Carlos",2);
        listaNome.inserir("Atila" , 3);
        System.out.println("-------------------------------------------------");
        System.out.println(listaNome);

        System.out.println("----------------------------------------------------");

        System.out.println(listaNome.estaNaLista("Atila"));
        System.out.println("-------------------------------------------------------");
        listaNome.remover(3);
        System.out.println(listaNome);
        System.out.println("-----------------------------------------------------------------");

        System.out.println(listaNome.estaNaLista("Atila"));

        System.out.println("-------------------------------------------------------------");

        System.out.println(listaNome.getElementos(1));
        System.out.println(listaNome.getPosicao("Kleyton"));


    }
    
}
