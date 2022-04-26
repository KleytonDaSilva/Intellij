package curso.java.aula33;

import curso.java.aula19.Array;

public class Exercicio03 {
    public Object Disciplina;
    private String nome;
    private int matricula;
    private String curso;
    private static String[] disciplina;
    private double [][] notas = new double[3][4];


    public Exercicio03(){
        disciplina = new String[3];
        notas = new double[3][4];
    }

    public Exercicio03(String nome, int matricula,String curso) {
        this.disciplina = new String[3];
        this.notas = new double[3][4];
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void mostrarInfor(){
        System.out.println("Nome do Aluno " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Curso pretendido: " + getCurso());

        for(int i=0; i < notas.length; i ++) {
            System.out.println("Notas da disciplina: " + disciplina[i]);
            for (int j = 0; j < disciplina[i].length(); j++) {
                System.out.println(notas[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean vereificarAprovado(int indice){
        if(obterMedia(indice) >= 7){
            return true;
        }
        return  false;
    }

    double obterMedia(int indice){
        double soma =0;
        for(int i =0; i < notas[indice].length; i ++ ){
            soma += notas[indice][i];
        }
        double media = soma / 4;
        return media;
    }

    public void setDisciplinaPosicao(int posicao, String Disciplina){
        this.disciplina[posicao] = Disciplina;
    }
    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notas[posI][posJ] = nota;
    }

}
