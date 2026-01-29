package Manzano;

// Questao 7 Exercicio L: Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
//soma dos quadrados dos três valores lidos.

import java.util.Scanner;

public class exercicio7L {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a, b, c, resultado;

        System.out.println("Digite o valor de A: ");
        a = sc.nextFloat();

        System.out.println("Digite o valor de B: ");
        b = sc.nextFloat();

        System.out.println("Digite o valor de C: ");
        c = sc.nextFloat();

        resultado = a * a + b * b + c * c;

        System.out.printf("A soma dos quadrados de A, B e C é %.1f", resultado);

        sc.close();
    }

}