package curso.java.estrutura.loiane.Pilha;

public class Main {
    public static void main(String[] args){
        Object elemento;
        Fila fila = new Fila();

        if (fila.ehVazia()){
            System.out.println("Vazia");
        }


        if (fila.temEspaco()){
            System.out.println("Tem espaco");
        }

        System.out.println("Numero de elementos na fila: "+ fila.getCardinalidade());

        if (!fila.existeElemento(1235)){
            System.out.println("Nao Existe");
        }

        fila.insere(1234);

        if (fila.existeElemento(1234)){
            System.out.println("Existe");
        }else
            System.out.println("Nao Existe");

        System.out.println("Numero de elementos na fila: "+ fila.getCardinalidade());

    }
}
