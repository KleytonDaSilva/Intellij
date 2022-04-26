package faculdade.programacao.estrutura.exemplo01aula;

//MODULO DE IMPLEMENTAÇÃO
public class Ponto { // classe ponto
    private double x; // atributo x
    private double y; // atributo y

    public Ponto(double x, double y){ // Construtor, recebe como parametro o X e o Y
        setPonto(x ,y);// pega-se o X e Y e passa como parametro para p setPonto, que vira um METODO abaixo
    }
    public void setPonto(double x, double y){ // METODO setPonto, pega o X e o Y e passa mais dois parametros
      SetX(x); // METODO SetX
      SetY(y); // METODO Sety
    }

    private void SetX(double x) {
    }

    private void SetY(double y) {
    }

    public double getX(){
        return x; //  retorna o x

    }

    public void setX(double x){ // METODO X vai pegar como PARAMETRO o SetX

        this.x = x; // estanciando objeto da classe, recebe invocação do METODO
    }
    public double getY(){

        return y; // retorna o y
    }

    public void setY(double y){ // mesma coisa no SetX

        this.y = y; // mesma coisa no SetX
    }
    public double distancia (Ponto p){
        // metodo para calcular a distancia, "p" é do tipo Ponto
        double dx = p.getX() - x; // crio "dx" que atribui o valor de X
        double dy = p.getY() - y; // crio "dy" que atribui o valor de Y
        return(double) Math.sqrt(dx * dx + dy * dy);
    }

    public String toStrin(){

        return"(" + x + " , " + y + " ) ";
    }
}
