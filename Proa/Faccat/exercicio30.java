package Faccat;

// Exercicio 30: Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente.

import java.util.Scanner;

public class exercicio30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o 1° número");

        int numero1 = sc.nextInt();

        System.out.println("digite o 2° número");

        int numero2 = sc.nextInt();

        System.out.println("digite o 3° número");

        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            if (numero2 > numero3) {
                System.out.println("Ordem crescente dos números digitados: " + numero1 + " " + numero2 + " " + numero3);
            } else {
                System.out.println("Ordem crescente dos números digitados: " + numero1 + " " + numero3 + " " + numero2);
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                System.out.println("Ordem crescente dos números digitados: " + numero2 + " " + numero1 + " " + numero3);
            } else {
                System.out.println("Ordem crescente dos números digitados: " + numero2 + " " + numero3 + " " + numero1);
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            if (numero2 > numero1) {
                System.out.println("Ordem crescente dos números digitados: " + numero3 + " " + numero2 + " " + numero1);
            } else {
                System.out.println("Ordem crescente dos números digitados: " + numero3 + " " + numero1 + " " + numero2);
            }
        }

        sc.close();
    }
}