package faculdade.programacao.estrutura.ExercicioPrimeiraAula;

import java.util.Scanner;

public class Main {
    public static void main(String [] arg){

        Ponto p1 = new Ponto(7.0,4.0);
        System.out.println(p1);

        Ponto p2 = new Ponto(2.0,8.0);
        System.out.println(p2);

        System.out.println(p1.distancia(p2));

       double Circulo = Circuferencia.diametroCirculo(3);
       double Circulo2 = Circuferencia.circunferencia(3);


        System.out.println("Diametro: " + Circulo);
        System.out.println("Perimetro: " + Circulo2);
    }
}
