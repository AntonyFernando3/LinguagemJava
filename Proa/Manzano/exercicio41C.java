package Manzano;

// Questão 41 Exercicio C: Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
//foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
//valor da média do aluno para qualquer condição.

import java.util.Scanner;

public class exercicio41C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua 1° nota");

        double nota1 = sc.nextDouble();

        System.out.println("Digite sua 2° nota");

        double nota2 = sc.nextDouble();

        System.out.println("Digite sua 3° nota");

        double nota3 = sc.nextDouble();

        System.out.println("Digite sua 4° nota");

        double nota4 = sc.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

        if (media >= 5) {
            System.out.println("O aluno foi aprovado com uma média de " + media);
        } else {
            System.out.println("O aluno foi reprovado com uma média de " + media);
        }

        sc.close();
    }
}
