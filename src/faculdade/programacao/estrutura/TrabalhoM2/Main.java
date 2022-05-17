package faculdade.programacao.estrutura.TrabalhoM2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        Calculadora cal = new Calculadora();
        String op;
        boolean iniciado = false;
        System.out.println("SUPER CALCULADORA");

        while (true)
        {
            op = sc.nextLine();
            op = op.toUpperCase();
            String numero = op;
            String[] operacao = op.split("\\("); // as "\\" é pra escape para considerar o "(" como caracter e não como função
            op = operacao[0];
            double valor;

            switch (op)
            {
                case "INICIO":
                {
                    cal.inicio();
                    iniciado = true;
                    break;
                }
                case "ZERA":
                {
                    if (iniciado)
                    {
                        cal.zera();
                        break;
                    } else
                    {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "SOMA":
                {
                    if (iniciado)
                    {
                        try{
                            valor = Double.parseDouble(pegaNumero(numero));
                            if(validaNumero(valor)) {
                                if (operacao.length == 2) {
                                    System.out.println("Somando");
                                    cal.soma(valor);
                                }
                                break;
                            } else {
                                System.out.println("** COMANDO INVALIDO **");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("** COMANDO INVALIDO **");
                            break;
                        }
                    }else
                    {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "SUBTRAI":
                {
                    if (iniciado)
                    {
                        try{
                            valor = Double.parseDouble(pegaNumero(numero));
                            if (validaNumero(valor)) {
                                if (operacao.length == 2) {
                                    System.out.println("Subtraindo");
                                    cal.subtrai(valor);
                                }
                                break;
                            }else {
                                System.out.println("** COMANDO INVALIDO **");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("** COMANDO INVALIDO **");
                            break;
                        }
                    } else
                    {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "MULTIPLICA":
                {
                    if (iniciado)
                    {
                        try{
                            valor = Double.parseDouble(pegaNumero(numero));
                            if (validaNumero(valor)) {
                                if (operacao.length == 2) {
                                    System.out.println("Multiplicando");
                                    cal.multiplica(valor);
                                }
                                break;
                            }else {
                                System.out.println("** COMANDO INVALIDO **");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("** COMANDO INVALIDO **");
                            break;
                        }
                    } else
                    {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "DIVIDE":
                {
                    if (iniciado)
                    {
                        try{
                            valor = Double.parseDouble(pegaNumero(numero));
                            if (validaNumero(valor)) {
                                if (operacao.length == 2) {
                                    System.out.println("Dividindo");
                                    cal.divide(valor);
                                }
                                break;
                            }else {
                                System.out.println("** COMANDO INVALIDO **");
                                break;
                            }
                        }catch (Exception e){
                            System.out.println("** COMANDO INVALIDO **");
                            break;
                        }
                    } else
                    {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "PARCELAS":
                {
                    if (iniciado)
                    {
                        try{
                            cal.parcelas();
                            break;
                        }catch (Exception e){
                            System.out.println("** COMANDO INVALIDO **");
                            break;
                        }
                    } else
                    {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "IGUAL":
                {
                    if (iniciado)
                    {
                        try{
                            System.out.println(cal.igual());
                            break;
                        }catch (Exception e){
                            System.out.println("** COMANDO INVALIDO **");
                            break;
                        }
                    } else
                    {
                        System.out.println("Programa não inciado");
                        break;
                    }
                }
                case "FIM":
                {
                    try{
                        cal.fim();
                        break;
                    }catch (Exception e){
                        System.out.println("** COMANDO INVALIDO **");
                        break;
                    }
                }
                default:
                {
                    System.out.println("** COMANDO INVALIDO **");
                    break;
                }
            }


        }
    }
    public static String pegaNumero(String s) {
        int indice_abre = s.indexOf('(');
        int indice_fecha = s.lastIndexOf(')');
        String conteudo = s.substring(indice_abre + 1, indice_fecha);
        return conteudo;
    }

    public static boolean validaNumero(double num){
        return num >0;
    }
}
