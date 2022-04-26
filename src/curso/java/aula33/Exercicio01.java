package curso.java.aula33;

public class Exercicio01 {
    private boolean status;

    public Exercicio01(boolean status) {
        this.status = status;
    }

    public boolean isStatus() { //  quando for BOOLEAN O GET TONAR is
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    boolean ligar(){
        if(status == true){
            System.out.println("Está ligado");
        }else{
            System.out.println("Está desligado");
        }
        return status;
    }
}
