package curso.java.aula25;

public class ClasseMetodosSimples {
    // 5 atributos

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    // métodos Simples, void é sem retorno, nome do método = ExibirAutonomia

    void exibirAutonomia(){

        System.out.println("A autonomia do arro é: " + capCombustivel * consumoCombustivel + "Km ");
    }
}
