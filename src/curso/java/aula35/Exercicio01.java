package curso.java.aula35;

public class Exercicio01 {

    static long fibonacci( int n){
        if(n < 2){
            return n;
        }else{
            return fibonacci(n - 1 ) + fibonacci(n - 2);
        }
    }
}
