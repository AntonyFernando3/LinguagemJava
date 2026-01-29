package Manzano;

// Questão 41 Exercicio I: Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem
//informando se o número é par ou ímpar.

import java.util.Scanner;

public class exercicio41I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor 1");

        int val1 = sc.nextInt();

        if ((val1%2)==0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O número digitado é impar");
        }

        sc.close();

    }

}
