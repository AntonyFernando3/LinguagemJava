package Manzano;

// Questao 7 Exercicio K: Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
//real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
//com o usuário, para que seja apresentado o valor em moeda americana.

import java.util.Scanner;

public class exercicio7K {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor atual do real em dólares: ");
        float valorReal = sc.nextFloat();

        System.out.println("Digite a quantidade de reais que deseja converter: ");
        Float reais = sc.nextFloat();

        float dolares = reais * valorReal;

        System.out.printf("%.2f reais correspondem a %.2f dólares.", reais, dolares);

        sc.close();
    }

}