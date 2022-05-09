package curso.java.estrutura.loiane.aulaLista;

public class Estrutura_dados_lista {
    private String[] elementos;
    private int tamanho;


    public Estrutura_dados_lista(int capacidade){//---
        this.elementos = new String[capacidade];
        this.tamanho =0;
    }
    // -------------------------------------------------------------- aula 3 adicionar no final do vetor
    //primeira opção
    public void adiciona(String elemento){//--- verificar quais os elmentos estão null
        for (int i =0; i <= elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }

        }

    }
    // segunda opção
    public void adiciona_novo(String elemento)throws Exception{

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("VETOR LOTADO!!!!");
        }
    }

    // terceira opção
    public boolean adicionar_boolean(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    //-----------------------------------------------------------------------Aula 07 Add em qualquer lugar do vetor
    // aqui vai ser criado um overload= sobre carregar o vetor

    public boolean adicionar_boolean (int posicao, String  elemento){

        if(!(posicao >= 0  && posicao < tamanho)){ // posição logica
            throw new IllegalArgumentException("Posição Invalida!!"); // verificar se existe espaço, posição logica no vetor

        }
        // Mover todos os elementos
        for(int i=this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho ++;

        return true;
    }

    //-----------------------------------------------------------------------Aula 05 de busca de posição


    public String busca (int posicao){
        if(!(posicao >= 0  && posicao < tamanho)){ // posição logica
            throw new IllegalArgumentException("Posição Invalida!!");
        }
        return this.elementos[posicao];
    }
    //-----------------------------------------------------------------------Aula 06 Se existe o Elemento no vetor

    public int existe(String elemento){
        for(int i=0; i <this.tamanho; i ++){
            if(this.elementos[i].equals(elemento)){ // equals para ver se é igual, ==
                return i;
            }
        }
        return -1; // -1 é uma posição que não existe no vetor, por isso se usa para dar false
    }

    //---------------------------------------------------------------------- Aula 04 tamanho
    // varredura do tamanho do vetor
    public int tamanho(){
        return this.tamanho;
    }

    // onde os elemetnos são imprimidos
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(" [ ");
        for(int i =0; i < this.tamanho-1; i ++){
            s.append( this.elementos[i]);
            s.append(" , ");
        }
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }
            s.append(" ] ");
        return  s.toString();
    }



}
