package Intellij.src.curso.java.aula40;

public class Main {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        pessoa.setEndereco("Rua 1000");
        aluno.setEndereco("Rua 1002");
        professor.setEndereco("Rua 1001");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());

        //Polimorfismo

    }
    
}
