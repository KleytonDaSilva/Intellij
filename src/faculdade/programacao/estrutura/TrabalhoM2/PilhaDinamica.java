package faculdade.programacao.estrutura.TrabalhoM2;

public class PilhaDinamica {
    private Node topo;
    private int tamanho;

    public PilhaDinamica()
    {
        topo = null;
    }
    public Node getTopo()
    {
        return topo;
    }
    public boolean ehVazio()
    {
        if (topo == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int getTamanho()
    {
        return tamanho;
    }
    public boolean encontreElemento(Object elemento)
    {
        Node n = topo;
        while (n != null)
        {
            if (n.getElement().equals(elemento))
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
    public Object retornoElemento(int posicao)
    {
        Node n = topo;
        for (int i = 0; i < (tamanho-posicao); i++)
        {
            n = n.getNext();
        }
        return n.getElement();
    }
    public void resetStack()
    {
        topo = null;
        tamanho = 0;
    }
    public void inserir(Object elemento)
    {
        Node n = new Node(elemento);
        n.setNext(topo);
        topo = n;
       tamanho++;
    }
    public void remove()
    {
        if (!ehVazio())
        {
            topo = topo.getNext();
            tamanho--;
        }
    }
    public void show()
    {
        if (!ehVazio())
        {
            Node n = topo;
            System.out.println("Topo do pilha......: " + n.getElement().toString());
            System.out.println("Tamanho da pilha...: " + tamanho);
            while (n != null)
            {
                System.out.println(n.getElement().toString());
                n = n.getNext();
            }
        } else
        {
            System.out.println("Pilha vazia");
        }

    }

}
