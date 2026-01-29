package Faccat;

//Exercicio 6: Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
//área do retângulo.

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular a area de um retangulo");

        System.out.println("Digite a altura do retangulo");

        int alt=sc.nextInt();

        System.out.println("Digite a base do retangulo");

        int base=sc.nextInt();

        int area= base * alt;

        System.out.println("A area do retangulo a: " + area);

        sc.close();
    }
}