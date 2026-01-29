package Manzano;

// Questao 7 Exercicio E: Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
//PRESTACAO ← VALOR + (VALOR * TAXA/100) * TEMPO).

import java.util.Scanner;

public class exercicio7E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float valor, taxa, prestacao;
        int tempo;

        System.out.println("Digite o valor da prestação em atraso em reais: ");
        valor = sc.nextFloat();

        System.out.println("Digite a taxa da prestação em porcentagem: ");
        taxa = sc.nextFloat() / 100;

        System.out.println("Digite o tempo em atraso da prestação: ");
        tempo = sc.nextInt();

        prestacao = valor + (valor * taxa) / tempo;

        System.out.printf("O valor da prestação será de R$ %.2f.", prestacao);

        sc.close();
    }

}