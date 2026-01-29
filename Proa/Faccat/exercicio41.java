package Faccat;

// Exercicio 41: Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
// N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
//Média_de_Aproveitamento = ---------------------------------------------------------
//7

import java.util.Scanner;

public class exercicio41 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua 1° nota");

        double nota1= sc.nextDouble();

        System.out.println("Digite sua 2° nota");

        double nota2= sc.nextDouble();

        System.out.println("Digite sua 3° nota");

        double nota3= sc.nextDouble();

        System.out.println("Digite sua média nos exercicios");

        double exercicios= sc.nextDouble();

        double media= (nota1 + (nota2 * 2) + (nota3 * 3) + exercicios) / 7;

        if (media >= 9) {
            System.out.println("Conceito A; nota: " + media);
        } else if(media >= 7){
            System.out.println("Conceito B; nota: " + media);
        } else if (media >= 6) {
            System.out.println("Conceito C; nota: " + media);
        } else {
            System.out.println("Conceito D; nota: " + media);
        }

        sc.close();
    }
}