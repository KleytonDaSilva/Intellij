package faculdade.programacao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a,b,c;

        System.out.println("Informe primeiro número");
        a = scan.nextInt();

        System.out.println("Informe segundo número");
        b = scan.nextInt();

        c = a + b;

        System.out.println("resultado: " + c);
    }
}
