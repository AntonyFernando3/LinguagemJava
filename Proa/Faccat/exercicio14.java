package Faccat;

// Exercicio 14:  Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10!

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero > 10) {
            System.out.println("O numero digitado e maior que 10.");
        } else if (numero < 10) {
            System.out.println("O numero digitado menor que 10.");
        } else {
            System.out.println("O numero digitado e 10.");
        }

        sc.close();
    }
}