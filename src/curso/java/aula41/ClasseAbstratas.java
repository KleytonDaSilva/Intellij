package Intellij.src.curso.java.aula41;

public class ClasseAbstratas {
    public static void main(String [] args){
       // Pessoa pessoa = new Pessoa();// Não da para instanciar uma classe abstrata, pot isso está comentado
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

       // pessoa.setEndereco("Rua 1000");// mersmo padrão de cima
        aluno.setEndereco("Rua 1001");
        professor.setEndereco("Rua 1002");


       // System.out.println(pessoa.getEndereco()); mesmo padrão de cima 
       // System.out.println(aluno.getEndereco());
        //System.out.println(professor.getEndereco());
        aluno.imprimirEtiquetaendereco();
        professor.imprimirEtiquetaendereco();
    }
    
}
