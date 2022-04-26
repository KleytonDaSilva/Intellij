package faculdade.programacao.estrutura.estruturaEcadeada;

public class Nodo {
    private int elemento;
    private Nodo proximo;

    public void setElemento(int elemento){
        this.elemento = elemento;

    }
    public int getElemento(){
        return this.elemento;

    }
    public void setProximo(Nodo proximo){
        this.proximo = proximo;
    }
    public Nodo getProximo(){
        return this.proximo;
    }

}
