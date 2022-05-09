package curso.java.estrutura_dados_KaneChan;

public class SegundaAula {
    private int id;
    private String nome;

    public SegundaAula(int id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override // --> vai mostrar os valores sem mostrar o endereço de memória
    public String toString() {
        return "Pessoas [ " + id + " , " + nome + " ] ";
    }
}
