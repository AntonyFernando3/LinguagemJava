package Manzano;

// Questão 41 Exercicio K: Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
//apresentação, caso o valor não seja maior que três.

import java.util.Scanner;

public class exercicio41K {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int val= sc.nextInt();

        if (val<=3){
            System.out.println("o valor " + val + " é menor ou igual à 3");
        }
        sc.close();
    }
}