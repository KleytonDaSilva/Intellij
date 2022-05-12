package faculdade.programacao.estrutura.ListaEstaticaGenerica;

import java.util.ArrayList;

public class Nodo<T> {
    private int tamanho;
    private ArrayList<T> elementos;

    public Nodo(int maximo) {
        tamanho = 0;
        elementos = new ArrayList<T>(maximo);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void insereNoFinal(T elemento) {
        elementos.add(elemento);
        tamanho++;
    }

    @Override
    public String toString() {
        return "Lista Estatica generica { " + "Elementos = " + elementos + "}";
    }


}
