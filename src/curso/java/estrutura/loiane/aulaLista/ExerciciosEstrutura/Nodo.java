package curso.java.estrutura.loiane.aulaLista.ExerciciosEstrutura;

import curso.java.estrutura.loiane.aulaListaEncadeada.No;

public class Nodo<T> {
    private T elemento;
    private No<T> proximo;

    public Nodo(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public Nodo(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }

}
