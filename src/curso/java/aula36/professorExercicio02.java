package curso.java.aula36;

public class professorExercicio02 {
    private String nomeEx;
    private String departamento;
    private String email;

    


    /**
     * @return String return the nomeEx
     */
    public String getNomeEx() {
        return nomeEx;
    }

    /**
     * @param nomeEx the nomeEx to set
     */
    public void setNomeEx(String nomeEx) {
        this.nomeEx = nomeEx;
    }

    /**
     * @return String return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo(){
        return "Professor= " + nomeEx;
    }

}
