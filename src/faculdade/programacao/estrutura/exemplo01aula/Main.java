package faculdade.programacao.estrutura.exemplo01aula;

public class Main {
    public static void main(String[] args ){
        Ponto p1 = new Ponto(7.0,4.0);
        System.out.println(p1.getX());

        Ponto p2 = new Ponto(2.0, 8.0);
        System.out.println(p2.getY());

        System.out.println(p1.distancia(p2));
    }
}
