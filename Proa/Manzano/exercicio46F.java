package Manzano;

// Questão 46 Exercicio F: Elaborar um programa que apresente como resultado o valor de uma potência de uma base
//qualquer elevada a um expoente qualquer, ou seja, de BE
//, em que B é o valor da base e E o valor
//do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
//portuguol (^).

import java.util.Scanner;

public class exercicio46F {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma base");

        double base= sc.nextDouble();

        System.out.println("Digite um expoente");

        double expo= sc.nextDouble();

        double result= Math.pow(base,expo);

        System.out.println(+ base + " elevado à " + expo + " é igual à: " + result);

        sc.close();
    }
}
