package Faccat;

// Exercicio 17:  Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1, nota2;
        float media;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2;

        if (media > 6) {
            System.out.printf("Aluno aprovado com média %.1f.", media);
        } else {
            System.out.printf("Aluno reprovado com média %.1f.", media);
        }

        sc.close();
    }

}