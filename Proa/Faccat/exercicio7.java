package Faccat;

//Exercicio 7:  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[]args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Descobrir a idade em dias");

        System.out.println("Digite o numero de anos de vida completos");

        int anos=sc.nextInt();

        System.out.println("Digite a quantidade de meses vividos");

        int meses=sc.nextInt();

        System.out.println("Agora, digite a quantidade de dias vividos");

        int dias=sc.nextInt();

        int total= (anos * 365) + (meses * 30) + dias;

        System.out.println("A sua idade corresponde a: " + total + " dias vividos.");

        sc.close();
    }
}
