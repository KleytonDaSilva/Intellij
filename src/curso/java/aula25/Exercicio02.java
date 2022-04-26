package curso.java.aula25;

public class Exercicio02 {
    // atributos variaveis da classe conta

    int agencia;
    int conta;
    int saldo;
    boolean status;
    int valorEspecialUsado;
    int limiteEspecial;

    boolean realizarSaque(int quantidadeSacar){
    // tem saldo na conta

        if(saldo >= quantidadeSacar){
            saldo -= quantidadeSacar;
            return true;
        }else{// não tem saldo na conta
            if(status){
                // verifica se o limite especial tem soldo
                int limite = limiteEspecial + saldo;
                if(limite >= quantidadeSacar){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false; // não é especial e não tem saldo sufuciente
            }
        }

    }

    void depositarDinheiro(int valorDepositado){

        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
