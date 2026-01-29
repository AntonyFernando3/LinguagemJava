package Faccat;

// Exercicio 24:  Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total.

import java.util.Scanner;

public class exercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salarioFixo, salarioFinal, valorVendas;

        System.out.println("Digite o salário fixo do funcionário em reais: ");
        salarioFixo = sc.nextFloat();

        System.out.println("Digite as vendas do mês do funcionário em reais: ");
        valorVendas = sc.nextFloat();

        if (valorVendas > 1500) {
            salarioFinal = salarioFixo + 1500 * 0.03f + (valorVendas - 1500) * 0.05f;
        } else {
            salarioFinal = salarioFixo + valorVendas * 0.03f;
        }

        System.out.printf("O salário deste mês do funcionário será de R$ %.2f.", salarioFinal);

        sc.close();
    }

}