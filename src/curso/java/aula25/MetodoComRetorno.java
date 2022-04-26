package curso.java.aula25;

public class MetodoComRetorno {

    String marca;
    String modelo;
    int numPassageiro;
    double consumoCombustivel;
    double capCombustivel;

    //começa com tipo de metodo, um retono do double
    double obterAutonomia(){
        System.out.println("Métdo obterAutonomia foi chamado: ");
        return capCombustivel * consumoCombustivel;
    }
}
