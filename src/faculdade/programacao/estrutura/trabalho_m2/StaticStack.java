package faculdade.programacao.estrutura.trabalho_m2;

public class StaticStack {
    private Object[] stack;
    private int top; // cardinalidade da pilha
    private int size; // tamanho total

    public StaticStack(int size)
    {
        stack = new Object[size];
        this.size = size;
        top = 0;
    }

    public boolean isEmpty()
    {
        if (top == 0)
        {
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if (top == size)
        {
            return true;
        }
        return false;
    }
    public int getTop()
    {
        return top;
    }
    public boolean findElement(Object element)
    {
        for (int i = 0; i < top; i++)
        {
            if (element == stack[i])
            {
                return true;
            }
        }
        return false;
    }
    public boolean isValid(int position)
    {
        if (position > 0 && position <= top)
        {
            return true;
        }
        return false;
    }
    public Object returnElement(int position)
    {
        if (isValid(position))
        {
            return stack[position-1];
        }
        else
        {
            return null;
        }
    }
    public Object returnTop()
    {
        return stack[top];
    }
    public void insert(Object element)
    {
        if (!isFull())
        {
            System.out.println("Inserindo valor " + element);
            stack[top] = element;
            top++;
        }
        else
        {
            System.out.println("PILHA CHEIA");
        }
    }
    public void remove()
    {
        if (!isEmpty())
        {
            System.out.println("Inserindo valor " + stack[top]);
            top--;
        }
        else
        {
            System.out.println("PILHA VAZIA");
        }
    }
    public void show()
    {
        System.out.println("TAMANHO TOTAL........: " + size);
        System.out.println("TOPO.................: " + top);
        for (int i = 0; i < top; i++)
        {
            System.out.println("#" + (i+1) + " " + stack[i]);
        }
    }

}
