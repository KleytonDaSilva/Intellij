package faculdade.programacao.estrutura.EstruturaLivroJava;

public class Node <T>{
    private T data; // dados para esse nó
    private Node<T> proximo; // referencia para o proximo nó na lista


    // construtor cria uma Node que referencia o objeto
    public Node(T object){
        this(object, null);// fim do construtor de um argumento Node
    }

    //Construtor cria Node que referencia o objeto
    // Especificado e a proxima Node
    Node(T object, Node<T> node){
        data = object;
        proximo = node;
    }//fim do construtor de dois argumentos Node

    // retorna referencia ao dados no nó
    T getData(){
        return data;//retorna o item nesse nó
    }// fim  do método getData

    // retorna referencia ao proximo nó na lista
    Node<T> getProximo(){

        return proximo; // obtém próximo nó
    }// fim do método getProximo

}
