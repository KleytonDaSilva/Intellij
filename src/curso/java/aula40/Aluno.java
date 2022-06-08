package Intellij.src.curso.java.aula40;

import Intellij.src.curso.java.aula38.Pessoa;

public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;
    
 
    public Aluno(){
        super();
    }
    /**
     * Super classe, sempre que buscar rewferencia da super classe, exemplo abaixo
     */

    public Aluno(String nome, String endereco, String telefone, String curso){ 
        super(nome,endereco,telefone);
        this.curso = curso;// this faz referencia a propria classe e o super da classe mãe
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean vereificarAprovado() {
        return true;
    }
    public String obterEtiquetaEndereco(){ // aqui o metodo herda da classe pai com algumas modificações 
                                           // aqui está sobre pondo o metodo da classe Pessoa 

        String s = "Endereço do aluno: ";
        s +=this.getEndereco();

        return s;
    }



}
