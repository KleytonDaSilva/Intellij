package curso.java.aula36;

public class Exercicio01 {
    private String nome;
    private Contato[] contatos;
   
    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    


    /**
     * @return Contato[] return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos2 the contatos to set
     */
    public void setContatos(ContatoExercicio[] contatos2) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Nome = " + nome;

            if(contatos != null){
                for(Contato c : contatos){
                    info += c.obterInfo();
                }
            }
        return info;

    }

}
