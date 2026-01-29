package Faccat;

// Exercicio 15: Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println(numero + "é  positivo.");
        } else if (numero < 0) {
            System.out.println(numero + "é negativo.");
        } else {
            System.out.println("zero é neutro.");
        }

        sc.close();
    }

}