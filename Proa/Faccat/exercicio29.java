package Faccat;

// Exercicio 29: Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.

import java.util.Scanner;

public class exercicio29 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o 1° número");

        int numero1= sc.nextInt();

        System.out.println("digite o 2° número");

        int numero2= sc.nextInt();

        System.out.println("digite o 3° número");

        int numero3= sc.nextInt();

        int soma;

        if (numero1>numero2 && numero2>numero3){
            soma= numero1 + numero2;

        } else if (numero1>numero3 && numero3>numero2){
            soma= numero1 + numero3;

        } else {
            soma= numero2 + numero3;
        }

        System.out.println("A soma dos dos maiores numeros é: " + soma);

        sc.close();

    }
}