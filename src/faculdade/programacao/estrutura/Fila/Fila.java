package faculdade.programacao.estrutura.Fila;

public class Fila <T>{
    private int tamanhoDoVetorFila;
    private int primeiraFila; // posição anteiror a primeiro ocupada
    private int ultimoFila; // posição do último elemento
    private T[] elementos;

    public Fila(int espacoDoVetor){
        tamanhoDOVetorFila =0;
        primeiraFila = ultimoFila = espacoDoVetor;
        elementos = (T[]) new Object[espacoDoVetor];
    }
    public boolean ehVazio(){
        return tamanhoDoVetorFila == 0;
    }

    public boolean estaCheio(){
        return  tamanhoDoVetorFila == elementos.length;
    }

   
    public int getTamanhoDoVetorFila() {
        return tamanhoDoVetorFila;
    }

    public boolean existe(T elemento){
        int contagem = 1;
        int posicao = primeiraFila;
        while(contagem <= getTamanhoDoVetorFila()){
            posicao ++;
            if(posicao > elementos.length)
                posicao = 0;
            
            if(elementos[posicao].equals(elemento))
                return true;
                contagem ++;
        }
        return false;
    }

    public boolean validandoPosicao( int posicao){

        return(posicao >= 1 ) &&(posicao <= getTamanhoDoVetorFila());
    }

    public T getElementos(int posicao){
        if((primeiraFila + posicao) <= elementos.length - 1){
        return elementos[primeiraFila + posicao];
        }else{
            return elementos[posicao - elementos.length + primeiraFila];
        }

        
    }




   
}
