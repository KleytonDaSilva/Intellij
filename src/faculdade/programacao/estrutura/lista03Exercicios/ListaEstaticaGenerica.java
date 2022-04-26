package faculdade.programacao.estrutura.lista03Exercicios;

import java.util.ArrayList;

public class ListaEstaticaGenerica <T> {
    private int cardinalidade;
    private ArrayList<T> elementos;

    public ListaEstaticaGenerica(int max){
        cardinalidade = 0;
        elementos =  new ArrayList<T>(max);
    }
    public int getCardinalidade(){
        return cardinalidade;
    }
    public  void insereNoFinal(T element){
        elementos.add(element);
        cardinalidade++;
    }

    @Override
    public String toString() {
        return "ListaEstaticaGenerica{" +
                "cardinalidade=" + cardinalidade +
                ", elementos=" + elementos +
                '}';
    }
}
