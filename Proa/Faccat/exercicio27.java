package Faccat;

// Exercicio 27: Ler um valor e escrever se é positivo, negativo ou zero.

import java.util.Scanner;

public class exercicio27 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int numero = sc.nextInt();

        if (numero>0){
            System.out.println("O número " + numero + " é maior que 0");
        } else {
            if (numero<0){
                System.out.println("O número " + numero + " é menor que 0");
            } else {
                System.out.println("O número digitado é zero");
            }
        }

        sc.close();
    }
}