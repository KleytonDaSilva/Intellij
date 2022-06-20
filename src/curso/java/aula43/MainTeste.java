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
    }

}
