package ex02;

import java.util.Scanner;

public class CalcAbastecimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoCombus;
        double taxaDesconto;

        System.out.println("--------------------------------");
        System.out.println("Boas-vindas ao E-Abastecimento");
        System.out.println("--------------------------------");

        System.out.printf("Digite a quantidade de litros vendidos: %n");
        double qtdLitros = sc.nextDouble();

        System.out.println("--------------------------------");
        System.out.printf("Informe o código do combustível que deseja %n");
        System.out.printf("'A' para álcool%n");
        System.out.printf("'G' para gasolina%n");
        System.out.printf("Digite aqui o código: ");

        String codCombus = sc.next();

        if (codCombus.equalsIgnoreCase("A")){
            precoCombus = 1.90;
            taxaDesconto = (qtdLitros <= 20) ?  0.03 : 0.05;
        } else if (codCombus.equalsIgnoreCase("G")) {
            precoCombus = 2.50;
            taxaDesconto = (qtdLitros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.printf("Opção Inválida! O programa será encerrado.%n");
            precoCombus = 0;
            taxaDesconto = 0;
        }

        double valorSemDesconto = qtdLitros * precoCombus;
        double valorDesconto = valorSemDesconto * taxaDesconto;
        double valorPagar = valorSemDesconto - valorDesconto;

        String espaco = " ";
        System.out.println("--------------------------------");
        System.out.printf("Subtotal a pagar: %1s R$ %.3f %n", espaco, valorSemDesconto);
        System.out.printf("Descontos: %8s R$ -%.3f %n", espaco, valorDesconto);
        System.out.printf("Total a pagar: %4s R$ %.3f %n", espaco, valorPagar);

    }
}
