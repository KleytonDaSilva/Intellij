package Intellij.src.curso.java.aula25;

public class MetodosComRetornoParametros {
    // atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    /*
     
    */

    double calculaCombustivel(double km){// metodo de parametro double km, não precisa usar nos atributos

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
