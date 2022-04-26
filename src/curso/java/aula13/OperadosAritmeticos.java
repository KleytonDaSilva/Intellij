package curso.java.aula13;

public class OperadosAritmeticos {

    public static void main(String[] args){

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado =  resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        // aqui é resultao + 1
        resultado ++;
        System.out.println(resultado);
        // aqui é 1 + resultado
        ++resultado;
        System.out.println(resultado);
    }
}
