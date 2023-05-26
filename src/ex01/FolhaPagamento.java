package ex01;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double taxaInss = 0.10;
        double taxaFgts = 0.11;
        double taxaIr;

        System.out.println("---------------------------------------------");
        System.out.println("Boas-vindas ao Gerador de Folha de Pagamento!");
        System.out.printf("----------------------------------------------%n%n");

        System.out.println("Digite o valor da sua hora trabalhada: ");
        double valorHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrab = sc.nextDouble();

        double salarioBruto = valorHora * horasTrab;

        if (salarioBruto <= 900) {
            taxaIr = 0;
        }
        else if (salarioBruto <= 1500) {
            taxaIr = 0.05;
        }
        else if (salarioBruto <= 2500) {
            taxaIr = 0.10;
        }
        else {
            taxaIr = 0.20;
        }

        double porcentagemIr = taxaIr * 100;
        double pagIr = taxaIr * salarioBruto;
        double pagInss = taxaInss * salarioBruto;
        double pagFgts = taxaFgts * salarioBruto;
        double descontos = pagIr + pagInss;
        double salarioLiquido = salarioBruto - pagIr - pagInss;

        String espaco = " ";
        System.out.printf("%n-------------Folha de Pagamento-------------%n");
        System.out.printf("Salário Bruto: (%.0f * %.0f) %10s: R$ %.2f %n", valorHora, horasTrab,espaco, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) %23s: R$ %.2f %n",porcentagemIr, espaco, pagIr);
        System.out.printf("(-) INSS (10%%) %20s: R$ %.2f %n", espaco, pagInss);
        System.out.printf("FGTS (11%%) %24s: R$ %.2f %n", espaco, pagFgts);
        System.out.printf("Total de descontos %16s: R$ %.2f %n", espaco, descontos);
        System.out.printf("Salário Líquido %19s: R$ %.2f", espaco, salarioLiquido);
        System.out.printf("%n--------------------------------------------");


    }
}

