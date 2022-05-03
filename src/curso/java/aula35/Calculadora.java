package curso.java.aula35;

/**
 * Recursividade é um método que chama ele mesmo, porém precisa de um ponto de parada
 */

public class Calculadora {

    // FATORIAL NÃO RECURSIVO -----
    public static int fatorialNaoRecursivo(int num){

        if(num ==0){
            return 1;
        }
        int total=1;
                for(int i=num;i > 1; i--){
                    total *= i;
                }
                return total;
    }

    public static int fatorialRecursivo( int num){
        if(num ==0){
            return 1;
        }
        return num * fatorialRecursivo(num -1);
    }
}
