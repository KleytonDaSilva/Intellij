package faculdade.programacao.estrutura.lista;

public class ListaEstatica {

    private int tamanhoLista = 1000;
    private int lista[] = new int[tamanhoLista];
    private int qtdeElementos = 0;
    private int posicao = 1;

    //ESTE CÓDIGO SÓ TRABALHA COM O PRIMEIRO INDICE IGUAL A 1
    //ESTA LISTA É DO TIPO INT
    //ESTE CÓDIGO NÃO ACEITA ELEMENTOS REPETIDOS NA LISTA, POR AUMENTAR A COMPLEXIDADE DO ALGORITMO SEGUNDO O PROFESSOR
    //POR EXEMPLO PARA REMOVER UM ELEMENTO REPETIDO, TERIA QUE REMOVER OS DOIS, E NAO SOMENTE O PRIMEIRO ENCONTRADO
    //ESTE CÓDIGO TAMBÉM SÓ TRABALHA COM A FORMA LÓGICA, OU SEJA, TRABALHA-SE COM O qtdeElementos para INSERIR, REMOVER E MOSTRAR OS ELEMENTOS
    //NÃO UTILIZA-SE A EXCLUSÃO FÍSICA DO ELEMENTO (NA MEMÓRIA), MAS SIM LÓGICA, OU SEJA, NAO MOSTRAMOS MAIS ELE, DECREMENTAMOS O qtdeElementos

    public ListaEstatica() {    }


    public boolean listaEstaCheia() {
        if(qtdeElementos != tamanhoLista){
            return false;
        }
        return true;
    }

    //cardinalidade
    public int getQtdeElemementos(){
        return qtdeElementos;

    }

    public void verificaElementoNaLista(int elemento) {

        for (int i = 1; i <= qtdeElementos; i++) {
            if (lista[i] == elemento) {
                System.out.println("Elemento " + elemento + "encontrado na lista");
            }
        }
    }

    public int verificaPosicaoValida(int posicao) {
        if (posicao > 0 && posicao <= tamanhoLista) {
            return 1;
        } else {
            return -1;  //caso a posicao nao seja valida
        }
    }

    public int recuperaElementoDaLista(int posicao) {
        if(verificaPosicaoValida(posicao) == 1){
            return lista[posicao];
        }
        return -1; //caso a posicao passada não seja valida
    }

    public int recuperaPosicaoElementoDaLista(int elemento) {
        if (elementoSeEncontraNaLista(elemento)) {
            for (int i = 1; i <= qtdeElementos; i++) {
                if (lista[i] == elemento) {
                    return i;
                }
            }
        }
        return -1;          //caso o elemento nao se encontra na lista
    }

    public void insereElementoNoInicio( int elemento) {
        if (!listaEstaCheia()) {
            if(qtdeElementos == 0){
                lista[1] = elemento;
                qtdeElementos++;
            }else{
                for(int i = qtdeElementos ; i >= 1 ; i--){
                    lista[i+1] = lista[i];
                }
                lista[1] = elemento;

                qtdeElementos++;      //conta a qtde de elementos dentro da lista
                System.out.println("qtde " + qtdeElementos);
            }
        }else{
            System.out.println("Não foi possível inserir, pois a lista está cheia");
        }
    }


    public void insereElementoNumaPosicao(int posicao, int elemento){
        if(verificaPosicaoValida(posicao) == 1){
            if(qtdeElementos == 0) {
                lista[1] = elemento;
                qtdeElementos++;
            }else{
                for(int i = qtdeElementos+1 ; i >= posicao ; i--){
                    lista[i] = lista[i-1];
                }
                lista[posicao-1] = elemento;
                qtdeElementos++;
            }

        }else{
            System.out.println("Não foi possível remover, pois a posicao é invalida ou elemento já se encontra na lista");
        }
    }

    public void removeElementoDoFinal(){
        qtdeElementos--;
    }

    public void removeElementoNumaPosicao(int posicao, int elemento) {

        if (elementoSeEncontraNaLista(elemento) == true){
            for (int i = 1; i <= qtdeElementos; i++) {
                if (lista[i] == elemento) {

                    for (int j = i; j < qtdeElementos ; j++) {
                        lista[j] = lista[j + 1];
                    }
                    qtdeElementos--;
                }
            }
        }else{
            System.out.println("Não foi possível remover, pois a posicao é invalida ou elemento já se encontra na lista");
        }

    }

    public boolean elementoSeEncontraNaLista(int elemento) {
        for (int i = 1; i <= qtdeElementos; i++) {
            if (lista[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public void exibirLista() {
        System.out.print("[");
        for (int i = 1; i <= qtdeElementos; i++) {
            System.out.print(lista[i]);
            if(i != qtdeElementos){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
