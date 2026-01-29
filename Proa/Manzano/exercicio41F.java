package Manzano;

// Questão 41 Exercicio F: Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.

import java.util.Scanner;

public class exercicio41F {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");

        int a = sc.nextInt();

        System.out.println("Digite o valor de B");

        int b = sc.nextInt();

        System.out.println("Digite o valor de C");

        int c = sc.nextInt();

        if (a>b && a>c){
            if (b>c){
                System.out.println("Ordem crescente: " + a + " " + b + " " + c);
            } else {
                System.out.println("Ordem crescente: " + a + " " + + c + " " + b);
            }
        } else if (b>a && b>c){
            if (a>c){
                System.out.println("Ordem crescente: " +  b + " " + a + " " + c);
            } else {
                System.out.println("Ordem crescente: " + b + " " + c + " " + a);
            }
        } else if (c>a && c>b){
            if(a>b){
                System.out.println("Ordem crescente: " + c + " " + a + " " + b);
            } else {
                System.out.println("Ordem crescente: " + c + " " + b + " " + a);
            }
        }

        sc.close();
    }
}