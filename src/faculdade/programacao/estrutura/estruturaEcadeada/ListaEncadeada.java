package faculdade.programacao.estrutura.estruturaEcadeada;

public class ListaEncadeada {
    private Nodo inicio;
    // criando construtor, lista vazia
    public ListaEncadeada(){
        this.inicio = null;
    }

    public void inserir(int elemento){
        // criar novo nodo
        Nodo nova = new Nodo();
        nova.setElemento(elemento); // inserir o elemento n caixinha
        nova.setProximo(null);  // depois dela não vem ninguem
        if(inicio == null){
            inicio = nova;
        }else{
            Nodo aux;
            aux = inicio;
            while ((aux.getProximo() != null)){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }
    public int retirar(){
       return -1;
   }

    public void listar(){
        if( inicio == null){
            System.out.println("Lista Vazia");
        }else{
            Nodo aux = inicio;
            while(aux.getProximo() != null){
                System.out.println("Elemento visto  " + aux.getElemento());
                aux = aux.getProximo();
            }
        }

    }
    public boolean isEmpty(){
        return this.inicio == null;
    }
}
