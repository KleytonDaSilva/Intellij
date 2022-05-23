package curso.java.aula36;

public class Contato {

    private String nome;
    private Endereco endereco; // substitui a String pela class endereco
    private Telefone [] telefones;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    public String obterInfo() {
        return null;
    }
}
