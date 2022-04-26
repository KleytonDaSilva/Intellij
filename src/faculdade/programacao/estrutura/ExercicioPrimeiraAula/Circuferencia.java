package faculdade.programacao.estrutura.ExercicioPrimeiraAula;

public class Circuferencia {
    private double x ;
    private double y ;
    private double  raio;

  public Circuferencia(double x, double y, double raio){
      this.x = x;
      this.y = y;
      this.raio = raio;
  }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y =y;
    }

    public double getCirc(){
        return raio;
    }

    public void setCirc(double raio){
        this.raio = raio;
    }

    public static double diametroCirculo(double raio){
      double diametro;
      diametro = 2 * raio;
      return diametro;
    }

    public static double circunferencia( double raio){
      double circufe;
      circufe = 2 * 3.14 * raio;
      return circufe;
    }
}
