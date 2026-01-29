package Manzano;

// Questão 26 Exercicio A: Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do
//percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).

import java.util.Scanner;

public class exercicio26B {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário mensal");

        double salarioMensal= sc.nextDouble();

        System.out.println("Digite o percentual de ajuste");

        double percentualReajuste= sc.nextDouble();

        double novoSalario= (salarioMensal * (percentualReajuste / 100)) + salarioMensal;

        System.out.println("Seu salário será ajustado para: R$" + novoSalario);

        sc.close();
    }
}