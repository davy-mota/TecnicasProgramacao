package Exercicio_38_URI;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
//########################Declaração das Variaveis##########################

        Scanner entrada = new Scanner(System.in);
        Scanner segundaEntrada = new Scanner(System.in);
        int qte, cod;
        double total = 0;
        String parada;
        boolean condicao = true;

//##########################Entrada de Dados##############################

        System.out.println("Informe o que deseja comprar:");
        System.out.println("1: cachorro quente\n2: X-Salada\n"
                + "3: X-Bacon\n4:Torrada Simples\n5: Refrigerante\n9: Encerrar\n");
        cod = entrada.nextInt();



        while (condicao) {

//#######################Validando os valores do código###################
            while (condicao) {
                if (cod == 9) {
                    System.out.printf("O total do seu pedido foi: R$%.2f\n", total);
                    System.out.println("Obrigado e volte sempre!");
                    condicao = false;
                    break;
                }
                if (cod >= 1 && cod <= 5) {
                    break;
                } else {
                    System.out.println("Digite um código válido!!!");
                    cod = entrada.nextInt();
                }
            }


//#########################Calculo do pedido########################

            while (cod >= 1 && cod <= 5) {

                System.out.println("Qual a quantidade?");
                qte = entrada.nextInt();

                if (qte > 0) {
                    if (cod == 1) {
                        total = total + qte * 4;
                    }
                    if (cod == 2) {
                        total = total + qte * 4.5;
                    }
                    if (cod == 3) {
                        total = total + qte * 5;
                    }
                    if (cod == 4) {
                        total = total + qte * 2;
                    }
                    if (cod == 5) {
                        total = total + qte * 1.5;
                    }
                }
                System.out.printf("Total: R$%.2f\n", total);
                System.out.println("\nInforme o que deseja comprar:");
                System.out.println("1: cachorro quente\n2: X-Salada\n"
                        + "3: X-Bacon\n4: Torrada Simples\n5: Refrigerante\n9: Encerrar\n");
                cod = entrada.nextInt();

            }

            entrada.close();
        }
    }
}
