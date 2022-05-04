package curso.java.aula29;

public class Main {
    public static void main(String[] args) {
        Construtores carro = new Construtores();
/* Instanciando

 */
        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        // carro.numPassageiros = 6;
        carro.capCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        System.out.println(carro.numPassageiros);

        Construtores carro1 = new Construtores("volvo", "x6", 5, 100, 0.6);

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.numPassageiros);
        System.out.println(carro1.capCombustivel);
        System.out.println(carro1.consumoCombustivel);
    }
}
