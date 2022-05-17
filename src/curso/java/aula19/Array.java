package curso.java.aula19;

public class Array {
    public static void main(String[] args){

        double tempDia01 = 31.3;
        double tempDia02 = 32.3;
        double tempDia03 = 33.3;
        double tempDia04 = 35.2;
        double tempDia05 = 34.4;

        double[] temperatura = new double[365];
        temperatura[0] = 31.3;
        temperatura[1] = 32.3;
        temperatura[2] = 33.3;
        temperatura[3] = 35.2;
        temperatura[4] = 34.4;

        System.out.println("temperatura  do dia 3 + " +  temperatura[2]);

        // O length é para ver o tamamnho do array
        System.out.println("Tamnho do ARRAY " + temperatura.length);

        // vai mostrar o endereço de memoria
        System.out.println("Endereço de memoria " + temperatura);

        for(int i=0; i < temperatura.length; i ++){
            System.out.println("O valor da temperatura do dia : " + ( i + i) + "É " + temperatura[i]);
        }

        // for melhorado

        for(double temp : temperatura){
            System.out.println(temp);
        }
    }
}
