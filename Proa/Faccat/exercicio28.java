package Faccat;

// Exercicio 28: Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class exercicio28 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int numero1= sc.nextInt();

        System.out.println("Digite outro número");

        int numero2= sc.nextInt();

        System.out.println("Digite o terceiro número");

        int numero3= sc.nextInt();

        if (numero1>numero2 && numero1>numero3){
            System.out.println("O maior numero é o primeiro: " + numero1);
        } else if (numero2>numero3 && numero2>numero1) {
            System.out.println("O maior numero é o segundo: " +numero2);
        } else {
            System.out.println("O maior número é o terceiro: " +numero3);
        }

        sc.close();
    }
}