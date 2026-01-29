package Faccat;

// Exercicio 13: Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
//final é:
// n1 * 2 + n2 * 3 + n3 * 5
// mediafinal = -----------------------------------
// 10

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Calcular nota");

        System.out.println("nota 1:");

        double nota1= sc.nextDouble();

        System.out.println("nota 2:");

        double nota2 = sc.nextDouble();

        System.out.println("Nota 3:");

        double nota3 = sc.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + ( nota3 * 5))/10;

        System.out.println("Sua media foi: " + media);

        sc.close();
    }
}