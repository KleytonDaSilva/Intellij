package faculdade.programacao.estrutura.ListaEstaticaGenerica;

public class Main {
    public static void main(String []args){
        Nodo<String> listaNome; listaNome = new Nodo<>(10);

        listaNome.insereNoFinal("Kleyton");
        listaNome.insereNoFinal("Carlos");

        System.out.println(listaNome);
//------------------------------------------------------------------------------------------
        Nodo<Integer> listaIdade; listaIdade = new Nodo<>(5);


        listaIdade.insereNoFinal(92);
        listaIdade.insereNoFinal(40);
        listaIdade.insereNoFinal(60);

        System.out.println(listaIdade);
//-----------------------------------------------------------------------------------------
        Nodo<Pessoa> listaPessoa; listaPessoa = new Nodo<>(3);

        Pessoa pessoa = new Pessoa("Marlon" , 33);
        listaPessoa.insereNoFinal(pessoa);
        pessoa = new Pessoa("Amanda" , 36);
        listaPessoa.insereNoFinal(pessoa);

        System.out.println(listaPessoa);
    }
}
