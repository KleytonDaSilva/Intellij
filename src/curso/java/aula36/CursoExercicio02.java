package curso.java.aula36;

public class CursoExercicio02 {
    private String nomeCur;
    private String horario;
    private  professorExercicio02 professor;
    private  AlunoExercicio02[]  aluno;
    private double[] notas;
    private AlunoExercicio02[] alunos;
    

    /**
     * @return String return the nomeCur
     */
    public String getNomeCur() {
        return nomeCur;
    }

    /**
     * @param nomeCur the nomeCur to set
     */
    public void setNomeCur(String nomeCur) {
        this.nomeCur = nomeCur;
    }

    /**
     * @return String return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return professorExercicio02 return the professor
     */
    public professorExercicio02 getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(professorExercicio02 professor) {
        this.professor = professor;
    }

    /**
     * @return AlunoExercicio02[] return the aluno
     */
    public AlunoExercicio02[] getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(AlunoExercicio02[] aluno) {
        this.aluno = aluno;
    }

    public String obterInfo(){
        String info = "Nome do curso = " + nomeCur + "\n";
        if(professor != null){
            info += professor.obterInfo();
        }
        if(aluno != null){
            System.out.println("-----ALUNO-----");
            for(AlunoExercicio02 aluno : aluno){
                info += aluno.obterInfo();
            }
        }
        return info;
    }

    public double obterMedia(){
        double soma =0;
        for(double nota : notas){
            soma += nota;
           
        }
        return soma /4 ;
    }

    public double obterMediaTurma(){    
        double soma = 0;
        for(AlunoExercicio02 aluno: alunos){
            if(aluno != null){
                soma += aluno.obterMedia();
            }
        }
        return soma/alunos.length;
    }

}
