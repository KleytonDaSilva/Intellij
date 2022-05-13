package curso.java.estrutura.loiane.aulaLista.ExerciciosEstrutura;

import javax.xml.transform.Source;

//Exercicio01 - Melhore a classe Lista e implemente o método contém, semelhando ao contains da classe ArrayList
public class Main {
    public static void main(String[] args) {
        Nodo<String> lista = new Nodo<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("C"));
    }
}
