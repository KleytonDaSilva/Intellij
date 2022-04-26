package curso.java.aula33;

public class Exercicio02 {
    private double deposito;
    private double saldo=0;
    private double saque;
    private double saca;

    public Exercicio02(){

    }

    public Exercicio02(double deposito, double saldo, double saque, double saca) {
        this.deposito = deposito;
        this.saldo = saldo;
        this.saque = saque;
        this.saca = saca;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaca() {
        return saca;
    }

    public void setSaca(double saca) {
        this.saca = saca;
    }

    public double depositar(){
        System.out.println("Você depositou: " + deposito);
        saldo = saldo + deposito;
        return saldo;
    }

    public double sacar(){
        saldo = saldo - saque;
    System.out.println("Você sacou: " + saldo );
        return saldo;
    }
    void consultarSaldo(){

        System.out.println("Saldo: " + saldo);
    }


}
