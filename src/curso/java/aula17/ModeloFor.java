package curso.java.aula17;

public class ModeloFor {
    public static void main(String [] args){

        for(int i =0; i < 10; i++){

            System.out.println("valor  de  i " + i);
        }

        System.out.println("------------------------------------------------------");

        for (int  i =10; i > 0 ; i--){
            System.out.println("valor de i " + i);
        }

        System.out.println("-------------------------------------------------------");

        for(int i=0, j=10; i < j; i++ , j--){

            System.out.println(" i = " + i + " j " + j );
        }

        System.out.println(" -------------------------------------------------------");

        int i = 0;

        for(; i <=10; i++){
            System.out.println("Valor de i " + i);
            i += 2;
        }


        System.out.println("--------------------------------------------------------");

        int soma = 0;

        for(int r =1; r < 10; soma += r ++){
            System.out.println("O valor da soma é: " + soma);
        }
    }
}
