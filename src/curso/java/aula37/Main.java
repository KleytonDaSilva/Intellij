package curso.java.aula37;
// Herança
public class Main {

    public static void main(String[] arg){
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // OU

        //Pessoa aluno = new Aluno(); --> superClasse ou polimorfimos 

        aluno.setCpf("062.001.679-58");
        System.out.println(aluno.getCpf());

    }
}
