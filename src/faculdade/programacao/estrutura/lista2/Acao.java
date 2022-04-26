package faculdade.programacao.estrutura.lista2;

public class Acao {
    private int precoAcaoAbertura = 0;
    private int precoAcao = 0;
    public int calculaPrecoAbertura(){
        ////((int)(min + Math.random() * (max - min + 1))
        return precoAcaoAbertura = ((int) (5 + Math.random() * (7 - 5 + 1)));
    }

    public int calculaPrecoAcao(){
        precoAcao = precoAcaoAbertura;
        precoAcao = precoAcao + ((int) (-3 + Math.random() * (3 + 3 + 1)));

        if(precoAcao > 0) {
            return precoAcao;
        }else{
            return 0;
        }
    }

    public void ordemCrescente(){

    }
}
