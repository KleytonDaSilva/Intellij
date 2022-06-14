package faculdade.programacao.estrutura.trabalho_m2;

public class DynamicStack {
    private Node top;
    private int size;

    public DynamicStack()
    {
        top = null;
    }
    public Node getTop()
    {
        return top;
    }
    public boolean isEmpty()
    {
        if (top == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getSize()
    {
        return size;
    }
    public boolean findElement(int element)
    {
        Node n = top;
        while (n != null)
        {
            if (n.getElement() == element)
            {
                return true;
            }
            else
            {
                n = n.getNext();
            }
        }
        return false;
    }
    public Object returnElement(int position)
    {
        Node n = top;
        for (int i = 0; i < (size-position); i++)
        {
            n = n.getNext();
        }
        return n.getElement();
    }
    public void resetStack()
    {
        System.out.println("Esvaziando pilha");
        top = null;
        size = 0;
    }
    public void insert(int element)
    {
        Node n = new Node(element);
        n.setNext(top);
        top = n;
        size++;
    }
    public void remove()
    {
        if (!isEmpty())
        {
            top = top.getNext();
            size--;
        } else
        {
            System.out.println("Pilha vazia");
        }
    }
    public void show()
    {
        if (!isEmpty())
        {
            Node n = top;
            System.out.println("Topo do pilha......: " + n.getElement());
            System.out.println("Tamanho da pilha...: " + size);
            while (n != null)
            {
                System.out.println(n.getElement());
                n = n.getNext();
            }
        } else
        {
            System.out.println("Pilha vazia");
        }

    }

}
