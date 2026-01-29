package Faccat;

//Exercicio12:  Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo):
// C F - 32
// ---------- = -----------
// 5 9
//Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Corversor de F para C");

        System.out.println("Digite uma temperatura em graus fahrenheit");

        double fahrenheit= sc.nextDouble();

        double celsius= (fahrenheit - 32) / 1.8;

        System.out.println(fahrenheit + "F equivale e: " + celsius + "C");

        sc.close();
    }
}