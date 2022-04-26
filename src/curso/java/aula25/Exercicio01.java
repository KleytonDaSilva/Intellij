package curso.java.aula25;

import java.security.spec.RSAOtherPrimeInfo;

public class Exercicio01 {
    String tipoLampada;
    int temperatura;
    int vidaUtil;
    int rendimentoLuminoso;
    int temperaturaCor;
    boolean ligada;

    void ligar(){
        ligada = true;

    }

    void desligar(){

        ligada = false;
    }

    void mostrarEstado() {

        if (ligada) {
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }
    void mudarEstado(){
            if(ligada){
                desligar();
            }else{
                ligar();
            }
    }

}
