package Intellij.src.curso.java.aula43;

public class MainTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação ");
        double[] notas = { 10, 9, 8, 7 };
        aluno.setNotas(notas);

        System.out.println(aluno);/// --> vai passar somente o endereço de memoria, usando toString evita isso.

        // 2 Exemplo

        String s1 = "kleyton";
        String s2 = "Marcos";

        System.out.println(s1 == s2);// OU
        System.out.println(s1.equals(s2));// modo equals

        System.out.println("------------------------------------------------------------Exercicio01");
        ContaBancariaExercicio01 conta = new ContaBancariaExercicio01();

        conta.setNomeCliente("Kleyton da Silva");
        conta.setNumConta(4545);
        conta.depositoDinheiro(450);
        conta.depositoDinheiro(3000);
        conta.sacarDinheiro(440);

        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumConta());
        System.out.println(conta.getSaldo());

    }

}
