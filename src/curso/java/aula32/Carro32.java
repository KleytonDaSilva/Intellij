package curso.java.aula32;

public class Carro32 {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public String getMarca() { // para obter o valor do set, mostra o valor que recebeu
        return this.marca;
    }

    public void setMarca(String marca) { // você chama o valor para atribuir valor, String marca é um parametro, 
                                         //recebe o valor
        this.marca = marca;
    }

}
