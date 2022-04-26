package curso.java.aula31;

public class main {
    public static void main(String[] arg){
        Carro carro = new Carro();
      //  carro.marca ="Fiat"; --> como na class está com private ele não deixa
        carro.modelo = "Toro";


      //  System.out.println(carro.marca);
        System.out.println(carro.modelo);
    }
}
