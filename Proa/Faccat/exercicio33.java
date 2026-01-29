package Faccat;

// Exercicio 33: Ler dois valores e imprimir uma das três mensagens a seguir:
//‘Números iguais’, caso os números sejam iguais
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//‘Segundo maior’, caso o segundo seja maior que o primeiro.

import java.util.Scanner;

public class exercicio33 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número A");

        int numeroA = sc.nextInt();

        System.out.println("Digite o número B");

        int numeroB = sc.nextInt();

        if (numeroA>numeroB){
            System.out.println("Primeriro é maior");
        } else if (numeroB>numeroA){
            System.out.println("Segundo é maior");
        } else {
            System.out.println("Números iguais");
        }

        sc.close();
    }
}