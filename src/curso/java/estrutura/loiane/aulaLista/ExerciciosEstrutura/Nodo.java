package curso.java.estrutura.loiane.aulaLista.ExerciciosEstrutura;

public class Nodo<T> {
    private T[] elementos;
    private int tamanho;

    public Nodo(int capacidade) {// ---
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // -------------------------------------------------------------- aula 3
    // adicionar no final do vetor
    // primeira opção
    public void adiciona(T elemento) {// --- verificar quais os elmentos estão null
        for (int i = 0; i <= elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }

        }

    }

    // segunda opção
    public void adiciona_novo(T elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("VETOR LOTADO!!!!");
        }
    }

    // terceira opção
    public boolean adicionar_boolean(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    // -----------------------------------------------------------------------Aula
    // 07 Add em qualquer lugar do vetor
    // aqui vai ser criado um overload= sobre carregar o vetor

    public boolean adicionar_boolean(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) { // posição logica
            throw new IllegalArgumentException("Posição Invalida!!"); // verificar se existe espaço, posição logica no
                                                                      // vetor
        }
        this.aumentaCapacidade();
        // Mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    // -----------------------------------------------------------------------Aula
    // 08 Aumentar capacidade do vetor

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    // -----------------------------------------------------------------------Aula
    // 05 de busca de posição

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) { // posição logica
            throw new IllegalArgumentException("Posição Invalida!!");
        }
        return this.elementos[posicao];
    }



    // -----------------------------------------------------------------------Aula
    // 06 Se existe o Elemento no vetor

    public int existe(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) { // equals para ver se é igual, ==
                return i;
            }
        }
        return -1; // -1 é uma posição que não existe no vetor, por isso se usa para dar false
    }

        /**
     * Exercicio 01 Loine
     * 
     * @KLEYTON
     * @return
     */
    public Boolean contem(T elemento) {

        return existe(elemento) > -1;
    }

    // -----------------------------------------------------------------------Aula09
    // Remover elementos

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("POsição invalida!!!");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    // ---------------------------------------------------------------------- Aula
    // 04 tamanho
    // varredura do tamanho do vetor
    public int tamanho() {
        return this.tamanho;
    }

    // onde os elemetnos são imprimidos
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" [ ");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(" , ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append(" ] ");
        return s.toString();
    }

}
