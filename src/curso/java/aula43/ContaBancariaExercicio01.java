package Intellij.src.curso.java.aula43;
/*
 * Exercicio01
 * elabore uma classe  ContaBancaria com os seguintes atributos ok
 * -nomeCliente  ok
 * -numConta     ok
 * -saldo        ok
 * 
 * E os seguintes métodos:
 * -sacar( o saldo não pode ficar negativo) ok
 * -depositar ok
 */

public class ContaBancariaExercicio01 {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    double sacarDinheiro(double saque) {

        
        if (saque > saldo) {
            System.out.println("Saldo insulficiênte " + saldo);
        } else {
            System.out.println("Saque Autorizado: " + saldo);
            saldo = saldo - saque;
        }

        return saldo;
    }

    double depositoDinheiro(double deposito) {

        System.out.println("Depositado: ");
        saldo = saldo + deposito;
        return saldo;
    }

}
