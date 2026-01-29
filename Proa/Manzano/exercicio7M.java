package Manzano;

// Questao 7 Exercicio M: Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
//quadrado da soma dos três valores lidos.

import java.util.Scanner;

public class exercicio7M {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, resultado;

        System.out.println("Digite o valor de A: ");
        a = sc.nextFloat();

        System.out.println("Digite o valor de B: ");
        b = sc.nextFloat();

        System.out.println("Digite o valor de C: ");
        c = sc.nextFloat();

        resultado = Math.pow(a + b + c, 2);

        System.out.printf("O quadrado da soma de A, B e C é %.1f", resultado);

        sc.close();
    }

}