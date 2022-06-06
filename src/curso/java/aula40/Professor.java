package Intellij.src.curso.java.aula40;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }
    public String obterEtiquetaEndereco(){ // aqui o metodo herda da classe pai com algumas modificações 
                                          // aqui está sobre pondo o metodo da classe Pessoa 

        String s = "Endereço do Professor ";
        s +=this.getEndereco();

            return s;
    }

}
