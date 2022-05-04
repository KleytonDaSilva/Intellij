package curso.java.aula25;

public class MetodosComRetornoParametros {
    // atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    /*
     * - pode ser vazio, void;
     * - como a classe não existo um atributo KM, se cria um parametro DOUBLE KM no
     * calculaCombustivel;
     * - No main recebe o valor do KM em uma variavel qtdCombustivel, double
     * qtdCombustivel = carro.calculaCombustivel(10);
     */

    double calculaCombustivel(double km) {// metodo de parametro double km, não precisa usar nos atributos

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
