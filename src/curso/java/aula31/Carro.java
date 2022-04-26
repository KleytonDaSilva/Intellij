package curso.java.aula31;
// class Carro -> é um default, só poder ser visto no mesmo pacote
public class Carro {
    private String marca; // somente a propria classe pode ver
    public  String modelo; // public qualquer um pode ver
    int numPassageiros;
    double capCombustivel;
    double consumoCombutivel;

    void exibirAutonomio (){
        System.out.println("AUTONOMIA DO CARRO É : " + this.capCombustivel * this.consumoCombutivel);
        // sem retorno
    }
    double obterAutonomia (){
        return capCombustivel * consumoCombutivel;
        // com retorno
    }
}
