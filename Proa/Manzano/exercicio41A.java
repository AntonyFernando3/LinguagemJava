package Manzano;

// Questão 41 Exercicio C: Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
//foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
//valor da média do aluno para qualquer condição.

import java.util.Scanner;

public class exercicio41A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");

        int a = sc.nextInt();

        System.out.println("Digite o valor de B");

        int b = sc.nextInt();

        int diferenca;

        if (a >= b) {
            diferenca = a - b;
        } else {
            diferenca = b - a;
        }

        System.out.println("Diferença entre os números: " + diferenca);

        sc.close();
    }
}