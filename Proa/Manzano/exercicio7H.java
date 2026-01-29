package Manzano;

// Questao 7 Exercicio H: Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
//VOLUME ← COMPRIMENTO * LARGURA * ALTURA.

import java.util.Scanner;

public class exercicio7H {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float lado, altura, profundidade, volume;

        System.out.println("Digite o lado do paralelepipedo em centímetros: ");
        lado = sc.nextFloat();

        System.out.println("Digite a altura do paralelepipedo em centímetros: ");
        altura = sc.nextFloat();

        System.out.println("Digite profundidade do paralelepipedo em centímetros: ");
        profundidade = sc.nextFloat();

        volume = lado * altura * profundidade;

        System.out.printf("O volume do paralelepipedo é %.1fcm³.", volume);

        sc.close();

    }

}