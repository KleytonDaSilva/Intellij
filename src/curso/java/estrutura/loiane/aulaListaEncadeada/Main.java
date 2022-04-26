package curso.java.estrutura.loiane.aulaListaEncadeada;

// aulas,2,3,4,5,6,7,8,9,10
public class Main {
    public static void main(String[] args){
        //-------------------------------- vetor aula02---------------------------------------------
        System.out.println("AULA02 VETOR-----------------------------------------------------------");
        Vetor vetor = new Vetor(5);

        int i = 0;
        i ++;



       // ------------------------------Adicionando novos elementos--03----------------------------------------------
        System.out.println("AULA03 ADICIONANDO NOVOS ELEMENTOS-----------------------------------------------------------");
        Vetor vetor1 = new Vetor(2);
        try {
            vetor1.adiciona("elemetno1");
            vetor1.adiciona("elemetno2");
            vetor1.adiciona("elemetno3");
        }catch (Exception e){
            e.printStackTrace();
        }
        //---------------------------------------tamanho aula04--------------------------------------------------------------
        System.out.println("AULA04 TAMANHO-----------------------------------------------------------");
        Vetor vetor2 = new Vetor(10);

        vetor2.adiciona("elemetno1");
        vetor2.adiciona("elemetno2");
        vetor2.adiciona("elemetno3");

        System.out.println(vetor2.tamanho());
        System.out.println(vetor2.toString());

        //-----------------------------------------buscar aula05--------------------------------------------
        System.out.println("AULA05 BUSCAR-----------------------------------------------------------");
        Vetor vetor3 = new Vetor(10);

        vetor3.adiciona("elemetno1");
        vetor3.adiciona("elemetno2");
        vetor3.adiciona("elemetno3");


        System.out.println(vetor3.buscar(0));


        //------------------------------------------nova busca sequencial aula06----------------------------------------------
        System.out.println("AULA06 NOVA BUSCA SEQUENCIAL-----------------------------------------------------------");
        Vetor vetor4 = new Vetor(10);

        vetor4.adiciona("elemento1");
        vetor4.adiciona("elemento2");
        vetor4.adiciona("elemento3");

        System.out.println(vetor4.busca("elemento3"));

        //----------------------------------------- adicionar elementos em qualquer posição do vetor  aula07----------------------------------------------------
        System.out.println("AULA07 ADICIONARO ELEMENTO EM QUALQUER POSIÇÃO-------------------------------------");
        Vetor vetor5 = new Vetor(10);

        vetor5.adiciona("B");
        vetor5.adiciona("C");
        vetor5.adiciona("E");
        vetor5.adiciona("F");
        vetor5.adiciona("G");

        System.out.println(vetor5);
        vetor5.adiciona(0,"A");
        System.out.println(vetor5);
        System.out.println("-----------------------------------------");
        System.out.println(vetor5);
        vetor5.adiciona(3,"D");
        System.out.println(vetor5);

        //------------------------------------------------------Aula 08 AUMENTA CAPACIDADE

        System.out.println("AULA08 AUMENTA CAPACIDADE -------------------------------------");
        Vetor vetor6 = new Vetor(3);

        vetor6.adiciona("B");
        vetor6.adiciona("C");
        vetor6.adiciona("E");
        vetor6.adiciona("F");
        vetor6.adiciona("G");

        System.out.println(vetor6);

        //------------------------------------------------------Aula 09 REMOVER ELEMENTOS

        System.out.println("AULA09 REMOVER ELEMENTOS -------------------------------------");
        Vetor vetor7 = new Vetor(3);
        vetor7.adiciona("B");
        vetor7.adiciona("C");
        vetor7.adiciona("E");
        vetor7.adiciona("F");
        vetor7.adiciona("G");

        System.out.println(vetor7);

        vetor7.remove(1);

        System.out.println(vetor7);
        //------------------------------------------------------Aula 09 REMOVER ELEMENTOS

        System.out.println("AULA09/2 REMOVER ELEMENTOS com busca -------------------------------------");
        Vetor vetor8 = new Vetor(3);
        vetor8.adiciona("B");
        vetor8.adiciona("C");
        vetor8.adiciona("E");
        vetor8.adiciona("F");
        vetor8.adiciona("G");

        System.out.println(vetor8);



        System.out.println("Remover o Elemento E");
        int pos = vetor8.busca("E");
        if(pos > -1){
            vetor8.remove(pos);
        }else{
            System.out.println("Elemetno não existe");
        }
        System.out.println(vetor8);

        //------------------------------------------------------Aula 10 REMOVER ELEMENTOS

        System.out.println("AULA10 GENERALIZAR O VETOR -------------------------------------");
        VetorObject vetor9 = new VetorObject(4);


        vetor9.adiciona(3);
        vetor9.adiciona(4);
        vetor9.adiciona(5);
        vetor9.adiciona(6);

        System.out.println("Tamanho = " + vetor9.tamanho());

        System.out.println(vetor9);

        System.out.println("AULA10/2 contato GENERALIZAR O VETOR -------------------------------------");
        VetorObject vetor10 = new VetorObject(4);
        Contato c1 = new Contato("kleyton ","9999-999","nksadam@gmil.com");
        Contato c2 = new Contato("katia ","9999-999","nksadam@gmil.com");
        Contato c3 = new Contato("jhon ","9999-999","nksadam@gmil.com");
        Contato c4 = new Contato("amanda ","9999-999","nksadam@gmil.com");

        vetor10.adiciona(c1);
        vetor10.adiciona(c2);
        vetor10.adiciona(c3);
        vetor10.adiciona(c4);
        System.out.println("Tamanho = " + vetor10.tamanho());

        System.out.println(vetor10);

        int poos = vetor10.busca(c1);

        if(poos > -1){
            System.out.println("Elemento exist no vetor");
        }else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println("--------------------------------------------------------------------------");
        //ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        //lista.adiciona (1);
        //System.out.println(lista);
    }


}






































