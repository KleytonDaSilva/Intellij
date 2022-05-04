package curso.java.aula35;

public class Exercicio02 {
        //Recursividade
        // somatorio de 5 = 5 + 4 + 3 + 2 + 1 = 15
    public static int somatorio( int n){
            if(n == 0){
                return 0;
            }
        return n + somatorio(n - 1);
    }


// REcursividade
// Outra forma de fazer o mesmo exercicio de recursividade
    public static int soma(int num){
        if (num == 0 ){
            return 1;
        }
        return num + soma(num - 1);
    }
}
