package curso.java.aula29;

import Intellij.src.curso.java.aula24.Carro;

public class Construtores {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Construtores(){
        System.out.println("Calsse carro foi instaciada");
        numPassageiros =4;
    }

    Construtores(String marca_, String modelo_, int numPassageiros_, double capCombustivel_,double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km ");
    }

    double obterAutonomia(){

        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km){

        return km / consumoCombustivel;
    }
}
