package Manzano;

// Questão 41 Exercicio G: Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

import java.util.Scanner;

public class exercicio41G {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor 1");

        int val1 = sc.nextInt();

        System.out.println("Digite o valor de 2");

        int val2 = sc.nextInt();

        System.out.println("Digite o valor de 3");

        int val3 = sc.nextInt();

        System.out.println("Digite o valor de 4");

        int val4 = sc.nextInt();


        if ((val1%2)==0){
            System.out.println("o valor " + val1 + " é divisivel por 2");
        } else {
            System.out.println("o valor " + val1 + " não é divisivel por 2");
        }

        if ((val2%2)==0){
            System.out.println("o valor " + val2 + " é divisivel por 2");
        } else {
            System.out.println("o valor " + val2 + " não é divisivel por 2");
        }

        if ((val3%2)==0){
            System.out.println("o valor " + val3 + " é divisivel por 2");
        } else {
            System.out.println("o valor " + val3 + " não é divisivel por 2");
        }

        if ((val4%2)==0){
            System.out.println("o valor " + val4 + " é divisivel por 2");
        } else {
            System.out.println("o valor " + val4 + " não é divisivel por 2");
        }



        sc.close();

    }

}
