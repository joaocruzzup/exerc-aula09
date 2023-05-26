package ex03;

import java.util.Scanner;

public class DetectaCulpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String classificacao;
        int i = 0;

        System.out.println("--------------------------------");
        System.out.println("Boas-vindas ao DetectaCulpa");
        System.out.println("--------------------------------");

        System.out.println("Responda as seguintes perguntas");
        System.out.println("Digite 'S' para SIM e 'N' para NÃO");
        System.out.println("--------------------------------\n");

        // Utilizei o operador ternário para diminuir a quantidade de linhas que ficaria com o if-else
        // Assim, a variável i é atualizada com a entrada, se for S, i é somado +1, se não permanece o mesmo valor (somado + 0)
        System.out.print("Telefonou para a vítima? ");
        i += (sc.next().equalsIgnoreCase("S") ? 1 : 0);

        System.out.print("Esteve no local do crime? ");
        i += (sc.next().equalsIgnoreCase("S") ? 1 : 0);

        System.out.print("Mora perto da vítima? ");
        i += (sc.next().equalsIgnoreCase("S") ? 1 : 0);

        System.out.print("Devia para a vítima? ");
        i += (sc.next().equalsIgnoreCase("S") ? 1 : 0);

        System.out.print("Já trabalhou com a vítima? ");
        i += (sc.next().equalsIgnoreCase("S") ? 1 : 0);

        switch (i) {
            case 2:
                classificacao = "Cúmplice";
                break;
            case 3:
            case 4:
                classificacao = "Suspeita";
                break;
            case 5:
                classificacao = "Assassino";
                break;
            default:
                classificacao = "Inocente";
        }

        System.out.printf("%n-------Ficha de Nível de Culpa-------%n");
        System.out.printf("O seu nível de culpa de 0 a 5 é: %d %n", i);
        System.out.printf("Você é: %s !", classificacao);

    }
}
