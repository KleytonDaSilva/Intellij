package curso.java.aula25;

public class Exercicio03 {
    String matricula;
    String nome;
    String curso;
    String[] disciplina; // pode fazer assim = new String[3], exemplono de baixo
    double[][] notas = new double[3][4];

    void mostrarInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);

        for(int i=0; i < notas.length; i ++){
            System.out.println("Notas da disciplina: " + disciplina[i]);
            for(int j=0; j < disciplina[i].length(); j++){
                System.out.println(notas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
