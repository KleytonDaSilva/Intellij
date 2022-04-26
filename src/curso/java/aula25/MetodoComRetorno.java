package Intellij.src.curso.java.aula25;

public class MetodoComRetorno {

    String marca;
    String modelo;
    int numPassageiro;
    double consumoCombustivel;
    double capCombustivel;

    /*
    -Ele só mostrar o retorna para o main para exibir a o valor;
    -Ele retornar um valor que pode ser declarado em uma variavel da classe main, Ex: double autonomia = van1.obterAutonomia();
    -double autonomia recebe o valor do método obterAutonomia();
    */

    //começa com tipo de metodo, um retono do double
    double obterAutonomia(){
        System.out.println("Métdo obterAutonomia foi chamado: ");
        return capCombustivel * consumoCombustivel;
    }
}
