package Intellij.src.curso.java.aula42;

public class ClasseFinal {
    public static void main(String[] args) {

        /*
         * final ela não pode ser extendida, ela é tratada como uma constate
         */

        Pessoal pessoa = new Pessoal();
        // Pessoal aluno = new Aluno();
        // Pessoal professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

    }

}
