package faculdade.programacao.estrutura.DuplamenteEncadeada;

public class No {
    private No proximo;
    private No anterior;
    private Object elemento;


    public No(No proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No(Object elemento) {
        this.elemento = elemento;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}
