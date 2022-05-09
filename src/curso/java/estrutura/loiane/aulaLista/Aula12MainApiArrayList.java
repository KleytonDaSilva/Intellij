package curso.java.estrutura.loiane.aulaLista;

import java.util.ArrayList;

public class Aula12MainApiArrayList {
    public static void main(String[] args){

        ArrayList<String> arraylist = new ArrayList<String>(); // mundo real kkkkk

        arraylist.add("A");
        arraylist.add("C");

        System.out.println(arraylist);
//-------------------------------------------------
        arraylist.add(1,"B");

        System.out.println(arraylist);
//--------------------------------------------------------
        boolean existe = arraylist.contains("A");
        if(existe){
            System.out.println("Elemento Existe no array");
        }else{
            System.out.println("Elemento não existe no array");
        }
//--------------------------------------------------------

        int pos = arraylist.indexOf("A");
        if(pos > -1){
            System.out.println("Elemento Existe no array" + pos);
        }else{
            System.out.println("Elemento não existe no array" + pos);
        }


    }
    
}
