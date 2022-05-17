package curso.java.estrutura.loiane.aulaLista.ExerciciosEstrutura;

public class ExercicioEstruturaDeDados {
    private  Object[] elementos;
    private int tamanho;


    public ExercicioEstruturaDeDados(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    // aula 02
    /* public void adiciona(String elemento){
        for(int i =0; i < this.elementos.length; i++){
            if(this.elementos[i] == null ){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/
    // aula03
   /* public void adiciona(String elemento) throws Exception{

        if(this.tamanho <  this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
        }else{
            throw new Exception("Vetor cheio");
        }

    }*/
    //aula04

    public boolean adiciona( Object elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] =elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // aula07 OVERLOAD
    public boolean adiciona(int posicao, Object elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        //parte da aula08
        this.aumentaCapacidade();
        // mover todos os elementos
        for(int i =this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] =  this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    // aula08

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new String[this.elementos.length * 2];
            for(int i =0; i  < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    //aula05
    public Object buscar(int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("posição inválida");
        }
        return this.elementos[posicao];
    }


    public int tamanho(){
        return this.tamanho;
    }

    //aula 06

    public int busca ( Object elemento){
        // busca sequencial, vai de elemento a elemnte até achar
        for(int i =0; i < this.tamanho; i++){
            if( this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;// não existe, por isso -1
    }

    //AULA09
    //
    public void remove (int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("posição inválida");
        }
        for(int i =posicao; i < this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho --;
    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i =0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append( " ] ");
        return  s.toString();
    }
}
