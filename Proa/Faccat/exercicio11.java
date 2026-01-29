package Faccat;

// Exercicio 11: Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor.

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o valor de comissao por carro vendido");

        float comissao= sc.nextFloat();

        System.out.println("Digite o numero de carros vendidos");

        float carros= sc.nextFloat();

        System.out.println("Digite o valor total das vendas");

        float vendas= sc.nextFloat();

        System.out.println("Digite o salario fixo");

        float salario= sc.nextFloat();

        float total= (comissao * carros) + ((vendas/100)*5) + salario;

        System.out.println("O salario final corresponde e de: R$" + total);

        sc.close();

    }
}