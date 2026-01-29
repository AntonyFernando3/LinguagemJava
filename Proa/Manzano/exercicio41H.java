package Manzano;

// Questão 41 Exercicio H: Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

import java.util.Scanner;

public class exercicio41H {

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

        System.out.println("Digite o valor de 5");

        int val5 = sc.nextInt();

        if (val1>val2 & val1>val3 & val1>val4 && val1>val5){
            System.out.println("O maior valor informado é o 1°: " + val1);
        } else if (val2>val1 & val2>val3 & val2>val4 && val2>val5){
            System.out.println("O maior valor informado é o 2°: " + val2);
        } else if (val3>val1 & val3>val2 & val3>val4 && val3>val5){
            System.out.println("O maior valor informado é o 3°: " + val3);
        } else if (val4>val1 & val4>val2 & val4>val3 && val4>val5){
            System.out.println("O maior valor informado é o 4°: " + val4);
        } else if (val5>val1 & val5>val2 & val5>val3 && val5>val4){
            System.out.println("O maior valor informado é o 5°: " + val5);
        }

        if (val1<val2 & val1<val3 & val1<val4 && val1<val5){
            System.out.println("O menor valor informado é o 1°: " + val1);
        } else if (val2<val1 & val2<val3 & val2<val4 && val2<val5){
            System.out.println("O menor valor informado é o 2°: " + val2);
        } else if (val3<val1 & val3<val2 & val3<val4 && val3<val5){
            System.out.println("O menor valor informado é o 3°: " + val3);
        } else if (val4<val1 & val4<val2 & val4<val3 && val4<val5){
            System.out.println("O menor valor informado é o 4°: " + val4);
        } else if (val5<val1 & val5<val2 & val5<val3 && val5<val4){
            System.out.println("O menor valor informado é o 5°: " + val5);
        }
        sc.close();
    }
}