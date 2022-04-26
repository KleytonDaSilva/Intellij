package curso.java.aula34;

public class TesteCalculadora {
    public int soma;

    public static int soma(int a , int b){

        return a + b;
    }

    public static double soma( double _a , int b){

        return _a + b;
    }

    public int soma ( int a, int b, int c){

        return a + b + c;
    }

    public int soma (int [] vetorInteiro){

        int total =0;

        for(int i =0; i < vetorInteiro.length; i ++){

            total += vetorInteiro[i];
        }
        return total;
    }
}

