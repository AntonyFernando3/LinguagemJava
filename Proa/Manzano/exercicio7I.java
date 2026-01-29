package Manzano;

// Questao 7 Exercicio I: Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
//segundo.

import java.util.Scanner;

public class exercicio7I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();

        resultado = (a - b) * (a - b);

        System.out.printf("O quadrado da diferença de %d por %d é %d.", a, b, resultado);

        sc.close();
    }

}