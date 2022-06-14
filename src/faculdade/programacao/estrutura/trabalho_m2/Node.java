package faculdade.programacao.estrutura.trabalho_m2;

public class Node {
    private int element;
    private Node next;

    public Node(int element)
    {
        this.element = element;
        next = null;
    }
    public int getElement()
    {
        return element;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
    public Node getNext()
    {
        return next;
    }

}
