package faculdade.programacao.estrutura.EstruturaLivroJava;

public class Lista <T>{

    private Node<T> primeiroNo;
    private Node<T> ultimoNo;
    private String nome; // String como lista usada na impressão

    //Construtor cria Lista vazia

    public Lista(){
        this("Lista");
    }

    public Lista (String listaNome){
        nome = listaNome;
        primeiroNo = ultimoNo = null;
    }

    // insere o item na frente da lista
    public void InsereNaFrente(T insereItem){
        if(ehVazio()){// primeiroNo  e ultimoNO referenciam o mesmo objeto
            primeiroNo =ultimoNo = new Node<T>(insereItem);
        }else{// primeiroNo referencia o novo nó
            primeiroNo = new Node<T>(insereItem, primeiroNo);
        }

    }
    // insere o item no fim da lista
    public void InsereNoFim( T insereItem){
        if(ehVazio()){

        }
    }

    public boolean ehVazio(){

     return primeiroNo == null;
    }

}
