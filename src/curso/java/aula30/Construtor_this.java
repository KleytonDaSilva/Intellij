package curso.java.aula30;

public class Construtor_this {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Construtor_this(){
        System.out.println("Classe carro foi instaciada");
        numPassageiros =4;
    }

   public Construtor_this(String marca, String modelo, int numPassageiros, double capCombustivel,double consumoCombustivel){
      this.marca = marca;
      this.modelo = modelo;
      this.numPassageiros = numPassageiros;// this.numPassageiro referencia o atributo numPassageiros, é para isso que serve
      this.capCombustivel = capCombustivel;
      this.consumoCombustivel =  consumoCombustivel;
       System.out.println("Chamando o construtor com 5 parâmetro");
    }

    public Construtor_this(String marca, String modelo){
        this(marca, modelo,10,100,06);
        System.out.println("Chamando o construtor com dois parametros ");
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * this.consumoCombustivel + " Km ");
    }

    double obterAutonomia(){
        return this.capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km){
        return km / consumoCombustivel;
    }
}
