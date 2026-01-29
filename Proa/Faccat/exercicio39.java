package Faccat;

// Exercicio 39: Para A = V, B = V e C = F, qual o resultado da avaliação das seguintes expressões:
//a) (A e B) ou (A xou B)
//b) (A ou B) e (A e C)
//c) A ou C e B xou A e não B

import java.util.Scanner;

public class exercicio39 {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int A = 1;
        int B = 1;
        int C = 2;

        int a = (A & B) | (A | B);
        int b = (A | B) & (A & C);
        int c = (A | C & B | A);

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);


    }

}