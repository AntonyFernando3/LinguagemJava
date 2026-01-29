package Manzano;

// Questão 41 Exercicio D: Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
//média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
//Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
//aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
//condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.

import java.util.Scanner;

public class exercicio41D {

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

        if (media < 7) {
            System.out.println("Média obtida: " + media + "; mínimo requerido: 7");

            System.out.println("Digite sua nota do exame");
            double exame= sc.nextDouble();
            media = (soma + exame) / 5;

            if (media>=5){
                System.out.println("O aluno foi aprovado com uma média de " + media);
            } else {
                System.out.println("O aluno foi reprovado com uma média de " + media);
            }
        } else {
            System.out.println("O aluno foi aprovado com uma média de " + media);
        }

        sc.close();
    }
}
