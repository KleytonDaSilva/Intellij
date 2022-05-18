package curso.java.estrutura.loiane.Pilha;

public class Fila{

    private int inicio, fim, cardinalidade;
    private Object[] elemento = new Object[5];

    public Fila() {
        this.inicio = -1;
        this.fim = -1;
        this.cardinalidade = 0;
    }

    public boolean ehVazia() {
        if (this.cardinalidade == 0) {
            return true;
        } else return false;
    }

    public boolean temEspaco() {
        if (this.cardinalidade < this.elemento.length) {
            return true;
        } else return false;
    }

    public int getCardinalidade() {
        return this.cardinalidade;
    }

    public boolean existeElemento(Object elemento) {
        if (ehVazia()) {
            return false;
        } else {
            for (int i = 0; i < this.elemento.length; i++) {
                if (this.elemento[i].equals(elemento)){
                    return true;
                }
            }
            return false;
        }
    }

    public boolean posicaoValida(int posicao) {
        if (posicao <= this.elemento.length) {
            return true;
        } else return false;


    }

    public void insere(Object elemento) {
        if (ehVazia()) {
            this.elemento[0] = elemento;
            this.cardinalidade++;
        } else {
            this.elemento[this.cardinalidade + 1] = elemento;
            this.cardinalidade++;
        }
    }
}
