package curso.java.aula16;

public class Exercicio09 {
    public static void main(String[] args){

        int numero = 0;
        int resto = 0;

        while(numero < 50){
            resto = numero % 2;
            numero ++;

            if(resto == 0){
                System.out.println("Número é IMPAR: " + numero);
            }
        }
    }
}
