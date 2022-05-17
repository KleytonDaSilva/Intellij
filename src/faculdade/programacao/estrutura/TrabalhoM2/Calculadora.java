package faculdade.programacao.estrutura.TrabalhoM2;

public class Calculadora {
    private PilhaDinamica count;

    public Calculadora() // inicio
    {
        count = new PilhaDinamica();
    }
    public void inicio()
    {
        System.out.println("Inicializando programa");
    }
    public void zera()
    {
        System.out.println("Zerando pilha");
        count.resetStack();
    }
    public void soma(double value)
    {
        count.inserir(value);
    }
    public void subtrai(double value)
    {
        value *= -1;
        count.inserir(value);
    }

    public void multiplica(double value)
    {   double val = 0;
        double aux = igual();
        for (int i=1; i< value; i++){
            val = val + aux;
        }
        count.inserir(val);
    }

    public void divide(double value)
    {   double valor = igual();
        double calc = valor/value;
        calc = valor - calc;
        calc *= -1; // subtracao do valor

        count.inserir(calc);

    }


    public void parcelas()
    {
        PilhaDinamica aux = new PilhaDinamica();
        Node n = count.getTopo();
//        int res = n.getElement();
        for (int i = 0; i < count.getTamanho(); i++)
        {
            aux.inserir(n.getElement());
            n = n.getNext();
        }
        n = aux.getTopo();
        double res = ((double) n.getElement());
        System.out.println("PARCELAS:");
        for (int i = 1; i < aux.getTamanho(); i++)
        {
            n = n.getNext();
            res += ((double) n.getElement());
            System.out.println(res);
        }
    }




    public double igual()
    {
        double res = 0.0;
        Node n = count.getTopo();
        while (n != null)
        {
            res += ((double) n.getElement());
            n = n.getNext();
        }
        return res;
    }
    public void fim()
    {
        System.exit(0);
    }


}
