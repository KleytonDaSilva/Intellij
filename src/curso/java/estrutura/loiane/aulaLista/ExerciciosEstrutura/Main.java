package curso.java.estrutura.loiane.aulaLista.ExerciciosEstrutura;

import curso.java.estrutura.loiane.aulaLista.Estrutura_dados_lista;

import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.Source;


public class Main {
    public static void main(String[] args) {

        //Exercicio01 - Melhore a classe Lista e implemente o método contém, semelhando ao contains da classe ArrayList
        ExercicioEstruturaDeDados lista = new ExercicioEstruturaDeDados(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));

 //-----------------------------------------------------------------------------------------
    System.out.println("-------------------------------------------------------------------------------------");
        //Exercicio - Melhore a classe Lista e implemente o método ultimoIndioce, semelhante ao método LastindexOF do ArrayList
        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        
        
        System.out.println(arrayList.lastIndexOf("A"));
        System.out.println("-----------------------------------------------------");
        System.out.println(lista.ultimoIndice("A"));
      

    } 

   

}
