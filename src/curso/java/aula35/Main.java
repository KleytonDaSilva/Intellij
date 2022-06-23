package curso.java.aula35;

import javax.sound.midi.Soundbank;
//Recursividade
public class Main {
    public static void main(String[]arg){
        // Não recursividade

        int fatotrialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatotrialNR);

        // Recursivo

        int fatorialR =  Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);


        System.out.println("----------------------------------------------------------Exercicio01");

            for( int i = 0; i < 30; i ++){
                System.out.println("( " + i + " ): " + ContaBancariaExercicio01.fibonacci(i) + "\t");
            }

        System.out.println("-------------------------------------------------------------Exercicio02");
            for( int i =5; i > 0; i --){
                System.out.println("(" + i + "):" + Exercicio02.somatorio(i));
            }

        System.out.println("-------------------------------------------------Exercicio02 Outra forma de fazer");

        System.out.println(Exercicio02.somatorio(5));
    }
}
