package Manzano;

// Questão 41 Exercicio B: Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
//valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
//de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.

import java.util.Scanner;

public class exercicio41B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");

        int valor = sc.nextInt();

        int modulo = 0;

        if (valor < 0) {
            modulo = valor * -1;
        }

        System.out.println("Modulo do valor apresentado: " + modulo);

        sc.close();
    }
}