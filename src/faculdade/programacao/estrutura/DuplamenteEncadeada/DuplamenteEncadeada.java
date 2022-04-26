package faculdade.programacao.estrutura.DuplamenteEncadeada;

public class DuplamenteEncadeada {
    private No primeiro;
    private No ultimo;
    private int totalDeElementos;

    public DuplamenteEncadeada() {
        this.totalDeElementos = 0;
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionaNoComeco(Object elemento) {
        No nova = new No(this.primeiro, elemento);
        this.primeiro = nova;

        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeiro;
        }
        this.totalDeElementos++;
    }
    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            No novo = new No(elemento);
            this.ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            this.ultimo = novo;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) { // No começo.
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) { // No fim.
            this.adiciona(elemento);
        } else {
            No anterior = this.pegaNodo(posicao - 1);
            No nova = new No(anterior.getProximo(), elemento);
            anterior.setProximo(nova);
            this.totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private No pegaNodo(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public Object getElemento(int posicao) {
        No nodo = pegaNodo(posicao);

        return nodo.getElemento();
    }

    public void removeDoComeco() {
        if (!this.posicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        this.primeiro = this.primeiro.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultimo = null;
        }

    }

    public void removeDoFim() {

        if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            No penultimo = ultimo.getAnterior();
            penultimo.setProximo(null);
            this.ultimo = penultimo;
            this.totalDeElementos--;
        }
    }

    public void remove(int posicao) {

        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        if (posicao == 0) {
            this.removeDoComeco();

        } else if (posicao == (this.totalDeElementos - 1)) {
            this.removeDoFim();

        } else {
            No anterior = this.pegaNodo(posicao - 1);
            No atual = anterior.getProximo();
            No proxima = atual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.totalDeElementos--;
        }
    }

    public int getTotalDeElementos() {
        return this.totalDeElementos;
    }

    public boolean ehVazia() {
        return this.totalDeElementos == 0;
    }

    public boolean existeElemento(Object elemento) {
        for (No nodo = primeiro; nodo != null; nodo = nodo.getProximo())
            if (elemento.equals(nodo.getElemento())) return true; //encontrou o elemento
        return false;                     // não encontrou o elemento
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        //SE HOUVER, CRIA UM OBJETO DO TIPO "StringBuilder" QUE RECEBE A ABERTURA DE UMA CHAVE
        StringBuilder builder = new StringBuilder();
        No atual = primeiro;
        for (int i = 0; i < this.totalDeElementos-1; i++) {
            builder.append(atual.getElemento());
            atual = atual.getProximo();
        }
        //FECHA O STRINGBUILDER COM UMA CHAVE
        builder.append(atual.getElemento());
        return builder.toString();

    }


    ////////////////////////////////////////////////
    public boolean saoIguais(DuplamenteEncadeada lista){
        No novo = lista.primeiro;//
        No atual = primeiro;

        if(totalDeElementos!= lista.totalDeElementos){//
            return false;
        }else{
            for(int i = 0 ; i < totalDeElementos ; i++){
                if(novo.getElemento().equals(atual.getElemento())){
                    novo = novo.getProximo();
                    atual = atual.getProximo();
                }else{
                    return false;
                }
            }
            return true;
        }
    }

    public DuplamenteEncadeada replicaRetorna(){
        int cont = 0;
        DuplamenteEncadeada lista2 = new DuplamenteEncadeada();
        No aux = primeiro;
        for( int i = 1 ; i <= totalDeElementos ; i++){
            while(cont <= i){
                System.out.println(totalDeElementos);
                System.out.println(aux.getElemento());
                lista2.adiciona(aux.getElemento());
                lista2.toString();
                cont++;

            }
            aux.getProximo();
        }


        return lista2;
    }


    public DuplamenteEncadeada replicaRetorna2(){
        int cont = 0;
        DuplamenteEncadeada lista2 = new DuplamenteEncadeada();
        for( int i = 1 ; i <= totalDeElementos ; i++){
            No aux = null;
            while(cont < i){
                System.out.println(aux.getElemento());
                lista2.adiciona(aux.getElemento());
                cont++;
            }
            cont=0;
            aux = aux.getProximo();

        }


        return lista2;
    }


    public void retiraUltimaOcorrencia(Object elemento){

        No anterior = ultimo.getAnterior();
        No auxiliar = ultimo;
        No proximo = ultimo.getProximo();
        while(!(auxiliar.getElemento().equals(elemento))){
            auxiliar = anterior;
            anterior = auxiliar.getAnterior();
        }
        anterior.setProximo(auxiliar.getProximo());
        proximo = auxiliar.getProximo();
        proximo.setAnterior(anterior);
        totalDeElementos--;
    }


}

