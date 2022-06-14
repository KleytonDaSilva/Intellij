package faculdade.programacao.estrutura.trabalho_m2;

public class Calculator {
    private DynamicStack count;

    public Calculator() // inicio
    {
        count = new DynamicStack();
    }
    public void inicio()
    {
        System.out.println("Inicializando programa");
    }
    public void zera()
    {
        count.resetStack();
    }
    public void soma(int value)
    {
        count.insert(value);
    }
    public void subtrai(int value)
    {
        value *= -1;
        count.insert(value);
    }
    public void parcelas()
    {
        DynamicStack aux = new DynamicStack();
        Node n = count.getTop();
//        int res = n.getElement();
        for (int i = 0; i < count.getSize(); i++)
        {
            aux.insert(n.getElement());
            n = n.getNext();
        }
        n = aux.getTop();
        int res = n.getElement();
        System.out.println("PARCELAS:");
        for (int i = 1; i < aux.getSize(); i++)
        {
            n = n.getNext();
            res += n.getElement();
            System.out.println(res);
        }
    }
    public int igual()
    {
        int res = 0;
        Node n = count.getTop();
        while (n != null)
        {
            res += n.getElement();
            n = n.getNext();
        }
        return res;
    }
    public void fim()
    {
        System.exit(0);
    }

}
