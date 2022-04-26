package curso.java.aula16;

public class Exercicio04 {
    public static void main(String[] args){
        int a = 80000;
        int b =200000;
        int anos = 0;

        while(a < b){
            // é usa para atribuição
            a+= (a / 100) * 3;
            b+= (b / 100) * 1.5;

            anos ++;
        }
        System.out.println("País A : " + a);
        System.out.println("País B : " + b);
        System.out.println("Anos : " + anos);
    }
}
