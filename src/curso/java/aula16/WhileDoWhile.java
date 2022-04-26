package Intellij.src.curso.java.aula16;

public class WhileDoWhile {
    public static void main(String[] args){
        int i = 1;
        int max = 10;

        System.out.println("Contando até: " + max);
        // Analisa o código e excuta
        while(i <= max){
            System.out.println("valor de i: " + i);
            i++;
        }

        System.out.println("--------------------------------------------------------------");

        // faz e mostra o resultado

        do{
            i++;
            System.out.println("valor de i: " + i);

        }while(i < 10);
    }
}
