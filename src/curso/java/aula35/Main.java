package curso.java.aula35;

public class Main {
    public static void main(String[]arg){
        // Não recursividade

        int fatotrialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatotrialNR);

        // Recursivo

        int fatorialR =  Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);
    }
}
