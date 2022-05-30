package curso.java.aula36;

public class AlunoExercicio02 {
    private String nomeEx2;
    private String matricula;
    private  double[] notas;

    /**
     * @return String return the nomeEx2
     */
    public String getNomeEx2() {
        return nomeEx2;
    }

    /**
     * @param nomeEx2 the nomeEx2 to set
     */
    public void setNomeEx2(String nomeEx2) {
        this.nomeEx2 = nomeEx2;
    }

    /**
     * @return String return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return double[] return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo(){

        String info = "Nome do Aluno: " + nomeEx2 + " ; ";
        info +="Matricula = " + matricula + " ; ";
        info += "Notas = ";
        double soma = 0;
        for( double nota : notas){
            soma += nota;
            info += nota + " ";
        }
        double media = soma / 4;
        info += "\n" + " Média = " + media + " - ";

        if(media >= 7 ){
            info += "APROVADO!!";
        }else{
            info += "REPROVADO!!";
        }

        return info;
    }

    public double obterMedia() {
        return 0;
    }

}
