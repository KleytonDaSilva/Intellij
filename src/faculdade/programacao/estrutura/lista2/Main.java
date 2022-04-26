package faculdade.programacao.estrutura.lista2;

public class Main {
    public static void main(String[] args){
        int posicao = 0;
        Lista lista = new Lista();
        Acao acao =  new Acao();

        lista.insereElementoNaLista(acao.calculaPrecoAbertura(),posicao);
        posicao++;
        for ( int i = 0 ; i < 18 ; i++){
            //18 variações do preço dentro de 6 horas + 1 do preço de abertura do papel
            lista.insereElementoNaLista(acao.calculaPrecoAcao(), posicao);
            posicao++;
        }

        System.out.println("Mercado da Ação XYZ123 ao longo do dia : ");
        lista.exibirLista();
        System.out.println("Quantidade de variações ao longo do dia : " + lista.getQtdeElemementos());


        for( int i =0; i < 18 ; i ++){
            
        }
    }
}
