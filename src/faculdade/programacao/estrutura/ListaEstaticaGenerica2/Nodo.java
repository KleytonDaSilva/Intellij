package faculdade.programacao.estrutura.ListaEstaticaGenerica2;

import java.util.ArrayList;

public class Nodo<T> {
    private int tamanho;
    private ArrayList<T> elementos;

    public Nodo(int maximo){
        tamanho =0;
        elementos = new ArrayList<>(maximo);
    }

    public boolean ehVazio(){
        return getTamanho() == 0;
    }
    public int getTamanho() {
        return tamanho;
    }
     
    public boolean estaNaLista(T elemento){
        return elementos.contains(elemento);
    }
    public  boolean ehValidoPsicao(int posicao){
            return ((posicao >= 1) && (posicao <= getTamanho()));
    }
    public T  getElementos(int posicao){
        try{
            return elementos.get(posicao - 1);
        }catch(Exception e){
            System.out.println("ERRO Na consulta!!");
        }
        return null;
    }

    public int getPosicao(T elemento){
        try{
            return elementos.indexOf(elemento) + 1;
        }catch(Exception e){
            System.out.println("ERRO na consulta da posição do elemento");
        }
        return -1;
    }

    public void inserir(T elemento, int posicao){
        try{
            elementos.add(posicao -1, elemento);
            tamanho ++;
        }catch(Exception e){
            System.out.println("Erro Na inserção");
        }
    }

    public void remover(int posicao){
        try{
            elementos.remove(posicao - 1);
        }catch(Exception e){
            System.out.println("Erro na remoção");
        }
    }

    @Override
    public String toString(){
        return "Lista { " + "elementos = " + elementos + " } ";
    }
    
    
}
