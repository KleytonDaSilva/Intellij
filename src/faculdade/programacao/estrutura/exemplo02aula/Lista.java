package faculdade.programacao.estrutura.exemplo02aula;

import javax.sound.midi.Soundbank;

public class Lista {
    private int[] elementos = new int[5];
    private int card;
    private int i;

    void Lista(){

    }

    void populaVetor() {
        for (i = 0; i < 5; i++) {
            elementos[i] = i;
            card++;
        }
    }
    public void mostra(){
        for (i = 0; i < 5; i++) {
            System.out.println(elementos[i]);
        }

    }
    public boolean ehVazio(){
        if(this.card == 0){
            return  true;
        }else{
            return false;
        }

    }

    public boolean ahEspaço(){
        if(this.card < this.elementos.length){
            return  true;
        }else{
            return false;
        }
    }
    public void pertenceLista(){
        int pertence = 4;
        int i =0;
        System.out.println("---------------------------------------------------------------");
        for (; i < elementos.length; i ++){

            if (pertence == elementos[i]) {
                System.out.println("O número: " + elementos[i]+ " Esta na lista ");
            } else {
                System.out.println("Não pertence: " + elementos[i] + " a Lista");
            }
        }



    }

}
