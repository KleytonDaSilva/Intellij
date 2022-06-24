package Intellij.src.curso.java.aula43;

/*
 * Crie também uma classe chamada ContaPoupanca com as seguiintes caracteristicas ok
 * -Atributo diaRendimento; ok
 * -método calcularNovoSaldo, recebe taxa de rendimento da poupança ok
 * - Atualizar o saldo
 */

public class ContaPoupancaExercicio01 extends ContaBancariaExercicio01 {
    
    private double diaRendimento;

    public double getDiaRendimento(){
        return this.diaRendimento;
    }

    public void setDiaRendimento(){
        this.diaRendimento = diaRendimento;

    }

    double calcularNovoSaldo(double juros){
        int dia = 30;
        double resultado;

        resultado = 30 * juros;
        return resultado;
    }

}
