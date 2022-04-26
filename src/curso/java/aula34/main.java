package curso.java.aula34;

public class main {

    public static void main(String[] arg){
        // Aqui sem o uso da static na class
        TesteCalculadora calc = new TesteCalculadora();

        calc.soma(10,5);
        calc.soma(5,2,9);

        System.out.println(" sem o uso do static ---> "  + calc.soma);
        System.out.println(" sem o uso do static ---> " + calc.soma);
        System.out.println("-------------------------------------------------------------------------------------");
        // com o uso do static na class---------------------------------------

        TesteCalculadora.soma(1,2 );
        TesteCalculadora.soma(6,2);

        System.out.println("Com o uso do static ---> "  );
        System.out.println("Com o uso do static ---> ");
    }
}
