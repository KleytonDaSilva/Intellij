package faculdade.programacao.estrutura.lista2;

public class Lista {
    private int tamanhoLista =1000;
    private int lista[] = new int[tamanhoLista];
    private int qtdeElementos;


    public Lista() {
        zerarlista();
    }

    private void zerarlista() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 0;
        }
    }
    //cardinalidade
    public int getQtdeElemementos(){
        return qtdeElementos;
    }
    public void verificaElementoNaLista(int elemento) {

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                System.out.println("Elemento " + elemento + "encontrado na lista");
            }
        }
    }

    public int recuperaElementoDaLista(int posicao) {
        return lista[posicao];

    }

    public boolean elementoSeEncontraNaLista(int elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public int recuperaPosicaoElementoDaLista(int elemento) {
        if (elementoSeEncontraNaLista(elemento) == true) {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] == elemento) {
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean listaEstaCheia() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public int verificaEspacoNaLista() {
        if (listaEstaCheia() == false) {
            return 1;
        }else{
            return -1;
        }

    }

    public void insereElementoNaLista(int elemento, int posicao) {
        if (listaEstaCheia() == false) {
            lista[posicao] = elemento;
            qtdeElementos++;                            //conta a qtde de elementos dentro da lista
        }

    }

    public int verificaPosicaoValida(int posicao) {
        if (posicao > 0 && posicao < lista.length) {
            return 1;
        } else {
            return -1;
        }
    }

    public void exibirLista() {
        System.out.print("[");
        for (int i = 0; i < qtdeElementos; i++) {
            System.out.print(lista[i] + ",");

        }
        System.out.println("]");
    }

    public void retirarElementoDaLista(int elemento) {

        for (int i = 0; i < qtdeElementos; i++) {
            if (lista[i] == elemento) {
                for (int j = i; j < qtdeElementos - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                qtdeElementos = qtdeElementos - 1;
            }
        }
    }
}
