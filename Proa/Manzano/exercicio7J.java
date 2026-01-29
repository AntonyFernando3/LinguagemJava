package Manzano;

// Questao 7 Exercicio J: Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
//dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
//disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

import java.util.Scanner;

public class exercicio7J {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor atual do dolar em reais: ");
        float valorDolar = sc.nextFloat();

        System.out.println("Digite a quantidade de dólares que deseja converter: ");
        int dolares = sc.nextInt();

        float reais = dolares * valorDolar;

        System.out.printf("%d,00 dólares correspondem a %.2f reais.", dolares, reais);

        sc.close();
    }

}