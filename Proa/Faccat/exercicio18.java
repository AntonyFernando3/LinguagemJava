package Faccat;

// Exercicio 18: Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoAtual, anoNascimento;

        System.out.println("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        System.out.println("Digite o ano de nascimento da pessoa: ");
        anoNascimento = sc.nextInt();

        if (anoAtual - anoNascimento >= 16) {
            System.out.printf("Essa pessoa pode votar.");
        } else {
            System.out.printf("Essa pessoa não pode votar.");
        }

        sc.close();
    }

}