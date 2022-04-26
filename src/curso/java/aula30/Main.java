package curso.java.aula30;

import curso.java.aula29.Construtores;

public class Main {
    public static void main(String [] args){

        Construtor_this carro1 = new Construtor_this("volvo", "x6", 5, 100, 0.6);

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.numPassageiros);
        System.out.println(carro1.capCombustivel);
        System.out.println(carro1.consumoCombustivel);
    }
}
