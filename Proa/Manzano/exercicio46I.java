package Manzano;

// Questão 46 Exercicio I: Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
//somatório e a média aritmética dos valores lidos.

import java.util.Scanner;

public class exercicio46I {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        double soma=0;


        for (int cont = 1; cont < 11; cont++){
            System.out.println("Digite o " + cont + "° número");
            double val= sc.nextDouble();
            soma += val ;
        }

        double media= soma / 10;

        System.out.println("Media dos números digitados: " + media);

        sc.close();
    }
}