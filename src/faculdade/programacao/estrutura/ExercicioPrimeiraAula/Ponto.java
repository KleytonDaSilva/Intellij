package faculdade.programacao.estrutura.ExercicioPrimeiraAula;

public class Ponto {
    private double x;
    private double y;

    public Ponto (double x, double y){
        setPonto(x ,y);
    }

    public void setPonto(double x, double y){
        setX(x);
        setY(y);

    }
    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }

    public void  setY(double y){
        this.y = y;
    }

    public double distancia(Ponto p){
        double dx = p.getX() - x;
        double dy = p.getY() - y;

        return (double) Math.sqrt(dx * dx + dy * dy);
    }


    public String toString(){
        return "(" + x + "," + y +")";
    }
}
