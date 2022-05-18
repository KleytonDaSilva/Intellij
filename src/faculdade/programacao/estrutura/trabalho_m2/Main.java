package faculdade.programacao.estrutura.trabalho_m2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        String op;
        boolean iniciado = false;
        System.out.println("SUPER CALCULADORA");
        System.out.println("Escolha uma das opções abaixo : ");
        System.out.println("1 . inicio");
        System.out.println("2 . zera");
        System.out.println("3 . soma(valor)");
        System.out.println("4 . subtrai(valor)");
        System.out.println("5 . multiplica(valor)");
        System.out.println("6 . divide(valor)");
        System.out.println("7 . parcelas");
        System.out.println("8 . igual");
        System.out.println("9 . fim");
        System.out.println("Digite a sua opção : ");

        while (true) {
            op = sc.nextLine();
            op = op.toUpperCase();
            String[] operacao = op.split(" ");
            op = operacao[0];
            int valor;

            switch (op) {
                case "INICIO": {
                    cal.inicio();
                    iniciado = true;
                    break;
                }
                case "ZERA": {
                    if (iniciado) {
                        cal.zera();
                        break;
                    } else {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "SOMA(": {
                    if (iniciado) {
                        System.out.println("Somando");
                        if (operacao.length == 2) {
                            valor = Integer.parseInt(operacao[1]);
                            cal.soma(valor);
                        } else {
                            System.out.println("COMANDO INVALIDO");
                        }
                        break;
                    } else {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "SUBTRAI": {
                    if (iniciado) {
                        if (operacao.length == 2) {
                            System.out.println("Subtraindo");
                            valor = Integer.parseInt(operacao[1]);
                            cal.subtrai(valor);
                        } else {
                            System.out.println("COMANDO INVALIDO");
                        }
                        break;
                    } else {
                        System.out.println("Programa não iniciado");
                    }
                }
                case "PARCELAS": {
                    if (iniciado) {
                        cal.parcelas();
                        break;
                    } else {
                        System.out.println("Programa não iniciado");
                        break;
                    }
                }
                case "IGUAL": {
                    if (iniciado) {
                        System.out.println(cal.igual());
                        break;
                    } else {
                        System.out.println("Programa não inciado");
                    }
                }
                case "FIM": {
                    cal.fim();
                    break;
                }
                default: {
                    System.out.println("COMANDO INVALIDO");
                    break;
                }
            }
        }
    }
}
