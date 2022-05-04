package curso.java.aula25;

public class Main {
    public static void main(String[] args){
        //-------------------------------------------------------------MÉTODOS SIMPLES, SEM RETORNO
        System.out.println("-------------------------------------------Métodos sem retorno");

        ClasseMetodosSimples van = new ClasseMetodosSimples();

        van.marca = "FIAT";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.consumoCombustivel = 0.5;
        van.capCombustivel = 100;
        van.marca = "fiat";

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();// chama o método simples

        //---------------------------------------------------------------------------------Método com retorno
        System.out.println("---------------------------------------------------------------Metodo com retorno");

        MetodoComRetorno van1 = new MetodoComRetorno();

        van1.marca = "HONDA";
        van1.modelo = "Civic";
        van1.numPassageiro= 4;
        van1.capCombustivel = 80;
        van1.consumoCombustivel = 0.15;


        System.out.println(van1.marca);
        System.out.println(van1.modelo);

        double autonomia = van1.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        //---------------------------------------------------------------------------- METODOS COM RETORNO PARAMETROS
        System.out.println("----------------------------------------------------------Metodos com retorno parametros");

        MetodosComRetornoParametros carro = new MetodosComRetornoParametros();

        carro.marca = "Honda";
        carro.modelo = "HRV";
        carro.numPassageiros = 5;
        carro.capCombustivel = 80;
        carro.consumoCombustivel = 0.25;

        double qtdCombustivel =  carro.calculaCombustivel(10);// 10 é parametro da classe metodoComRetornoParametro

        System.out.println("Quantidade de combustivel de 10 km : " + qtdCombustivel);
    }
}
