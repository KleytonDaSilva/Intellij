package Intellij.src.curso.java.aula43;
/*
 * Crie também uma classe chamada ContaEspecial com as seguiintes caracteristicas ok
 * -Atributo limite; ok
 * -sobrescrever o método sacar com a nova lógica necessária
 * - Atualizar o saldo
 */

public class ContaEspecialExercicio01 extends ContaBancariaExercicio01 {

    private double limite;

    double clienteEspecial(double saldo) {
        if (saldo >=  3000) {
            limite = saldo * 3;
            System.out.println("Você possui um limite: " + limite);
        }
        return limite;
    }

}
