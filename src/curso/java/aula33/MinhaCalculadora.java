package curso.java.aula33;
// overload
public class MinhaCalculadora {
    public int soma(int num1, int num2 ){//--> metodos 

        return num1 + num2;
    }
    public double soma(double num1_, int num2){// --> metodos

        return num1_ + num2;
    }

    public int soma(int num1, int num2, int num3){//--> metodos ...

        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiro){

        int total =0;

        for(int i =0; i < vetorInteiro.length; i ++){

            total += vetorInteiro[i];
        }
        return total;
    }
}
