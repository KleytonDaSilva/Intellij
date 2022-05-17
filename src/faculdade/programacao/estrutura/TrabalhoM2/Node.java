package faculdade.programacao.estrutura.TrabalhoM2;

public class Node <T> {
    private Object elemento;
    private Node proximo;

    public Node(Object element)
    {
        this.elemento = element;
        proximo = null;
    }
    public Object getElement()
    {
        return elemento;
    }
    public void setNext(Node next)
    {
        this.proximo = next;
    }
    public Node getNext()
    {
        return proximo;
    }

}
