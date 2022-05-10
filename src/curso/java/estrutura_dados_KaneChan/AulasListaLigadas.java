package curso.java.estrutura_dados_KaneChan;

public class AulasListaLigadas <T> {
    
    private Nodo<T> primeiroNo;
    private Nodo<T> ultimoNo;
    private int tamanho;

    public AulasListaLigadas(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;

    }

    public void inserir(T elemento){
        Nodo<T> novoNo = new Nodo<T>(elemento);

        if(ehVazia()){
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        }else{
            this.ultimoNo.setProximo(novoNo);
            this.ultimoNo = novoNo;
        }

        this.tamanho ++;

    }
    private boolean ehVazia(){
        return this.tamanho == 0;
    }

       @Override
       public String toString(){
           if(ehVazia()){
                return "Lista Vazia";
            }else{
                Nodo<T> noAtual = this.primeiroNo;
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append("Lista [ ");
                stringbuilder.append(noAtual.getElemento() != null ? noAtual.getElemento().toString() : " <nulo>");
                stringbuilder.append(" , ");

                while (noAtual.getProximo() != null){
                    stringbuilder.append(noAtual.getProximo().getElemento() != null ? noAtual.getProximo().toString(): " <Nulo> ");
                    stringbuilder.append(" , ");
                    noAtual = noAtual.getProximo();
                }
                stringbuilder.append(" ] ");
                return stringbuilder.toString();
            }    

       } 
}
