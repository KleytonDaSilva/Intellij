package curso.java.aula24;

import java.util.Date;

public class MainOrientadoObjetos {
    public static void main(String[] args){
        /*EXEMPLO DE CLASSE
        *class nomeDaclasse{
        * variaveis da classe
        * variavel01 int;
        * variavel02 int;
        * variavel03 int;
         */

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducate";
        van.numPassgeiros = 10;
        van.capCombustivel =100;
        van.consumoCombustivel = 0.2;

        System.out.println(van); //endereço de memória alocado
        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);

        //------------------------------------------------------------------------------------------EXERCICIO01
        System.out.println("------------------------------------------------------------------------EXERCICIO01");
        Exercicio01 led = new Exercicio01();

        led.tipoLampada = "Led";
        led.temperatura = 5000;
        led.vidaUtil = 5000;
        led.rendimentoLuminoso = 35;
        led.temperaturaCor = 6700;

        System.out.println(led); // endereço de memória alocado;
        System.out.println("Temperatura: " + led.temperatura);
        System.out.println("Vida Útil: " + led.vidaUtil);
        System.out.println("Tipo de Lâmpada: " + led.tipoLampada);
        System.out.println("Rendimento: " + led.rendimentoLuminoso);
        System.out.println("Temperatura: " + led.temperaturaCor);

        //-------------------------------------------------------------------------------------------EXERCICIO02
        System.out.println("-------------------------------------------------------------------------EXERCICIO02");

        Exercicio02 livro = new Exercicio02();

        livro.nome = "HTML & CSS";
        livro.area = "INFORMATICA";
        livro.autor = "Jon DUCKETT";
        livro.editora = "ALTA BOOKS";
        livro.numPagina = 200;

        System.out.println(livro); // endereço de memória alocado;
        System.out.println("Titulo do Livro : " + livro.nome);
        System.out.println("Área do livro: " + livro.area);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Páginas: " + livro.numPagina);


        //--------------------------------------------------------------------------------------------EXERCICIO03
        System.out.println("--------------------------------------------------------------------------EXERCICIO03");

        Exercicio02 livro1 = new Exercicio02();
        Exercicio03 livraria = new Exercicio03();

        livraria.livraria  = "Catarinense";
        livraria.valor = 180.99;
        livro1.nome = "HTML & CSS";
        livro1.area = "INFORMÁTICA";
        livro1.autor = "Jon DUCKETT";
        livro1.editora = "ALTA BOOKS";
        livro1.numPagina = 200;

        System.out.println(livraria); // endereço de memória alocado
        System.out.println(livro1); // endereço dememória alocado

        System.out.println("Livraria: " + livraria.livraria);
        System.out.println("Valor do Livro: " + livraria.valor);
        System.out.println("Titulo do Livro : " + livro1.nome);
        System.out.println("Área do livro: " + livro1.area);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Editora: " + livro1.editora);
        System.out.println("Páginas: " + livro1.numPagina);

        //---------------------------------------------------------------------------------------------EXERCICIO04
        System.out.println("---------------------------------------------------------------------------EXERCICIO04");

        Exercicio02 livro2 = new Exercicio02();
        Exercicio04 municipal =  new Exercicio04();

        municipal.biblioteca = "BIBLIOTECA MUNICIAPAL";
        municipal.status = true;
        municipal.dataEntrega = new Date();
        livro2.nome = "HTML & CSS";
        livro2.area = "INFORMÁTICA";
        livro2.autor = "Jon DUCKETT";
        livro2.editora = "ALTA BOOKS";
        livro2.numPagina = 200;

        System.out.println(livro); // endereço de memória alocado
        System.out.println(municipal); // endereço de memória alocado
        System.out.println("Biblioteca: " + municipal.biblioteca);
        System.out.println("Status: " + municipal.status);
        System.out.println("Data de Entrega: " + municipal.dataEntrega);
        System.out.println("Titulo do Livro : " + livro2.nome);
        System.out.println("Área do livro: " + livro2.area);
        System.out.println("Autor: " + livro2.autor);
        System.out.println("Editora: " + livro2.editora);
        System.out.println("Páginas: " + livro2.numPagina);

        //----------------------------------------------------------------------------------------------EXERCICIO05
        System.out.println("----------------------------------------------------------------------------EXERCICIO05");

        Exercicio05 conta1 = new Exercicio05();


        conta1.conta = 123564;
        conta1.agencia = 14589;
        conta1.status ="Especial";
        conta1.limite = 100000;

        System.out.println(conta1); // endereço de memória alocado;
        System.out.println("Conta: " + conta1.conta);
        System.out.println("Agencia: " + conta1.agencia);
        System.out.println("Status: " + conta1.status);
        System.out.println("Limite: " + conta1.limite);

        //--------------------------------------------------------------------------------------------------EXERCICIO06
        System.out.println("--------------------------------------------------------------------------------EXERCICIO06");

        Exercicio06 agenda = new Exercicio06();

        agenda.nome = "Kleyton da Silva";
        agenda.email = "nksaddam@gmail.com";

        agenda.numero = new int[3];
        agenda.numero[0] = 984253735;
        agenda.numero[1] = 999716790;
        agenda.numero[2] = 985368471;
    }
}
