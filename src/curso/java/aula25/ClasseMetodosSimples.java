package curso.java.aula25;

public class ClasseMetodosSimples {
    // 5 atributos

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
        /*
        -São usados quando não precisa de retornar algum VALOR;
        -No métodos simples ou sem retorno, dentro da classe ele pode acessar qualquer atribudo: EX: marca, modelo numPassageiros etc..
        */

    // métodos Simples, void é sem retorno, nome do método = ExibirAutonomia

    void exibirAutonomia(){

        System.out.println("A autonomia do arro é: " + capCombustivel * consumoCombustivel + "Km ");
    }
}
