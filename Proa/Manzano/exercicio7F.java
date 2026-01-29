package Manzano;

// Questao 7 Exercicio F: Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de
//forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
//variável A. Apresentar os valores trocados

import java.util.Scanner;

public class exercicio7F {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();

        a = a - b;
        b = b + a;
        a = b - a;

        System.out.printf("O valor de A se tornou %d e o valor de B se tornou %d.", a, b);

        sc.close();
    }
}