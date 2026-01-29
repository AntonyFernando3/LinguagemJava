package Manzano;

// Questao 7 Exercicio G: Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
//utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
//devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
//C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
//multiplicação e apresentar doze resultados de saída.

import java.util.Scanner;

public class exercicio7G {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("digite o valor de A: ");
        a = sc.nextInt();

        System.out.println("digite o valor de B: ");
        b = sc.nextInt();

        System.out.println("digite o valor de C: ");
        c = sc.nextInt();

        System.out.println("digite o valor de D: ");
        d = sc.nextInt();

        System.out.printf("%d + %d = %d, %d + %d = %d, %d + %d = %d, %d + %d = %d, %d + %d = %d\n", a, b, a+b, a, c, a+c, a, d, a+d, b, c, b+c, c, d, c+d);
        System.out.printf("%d x %d = %d, %d x %d = %d, %d x %d = %d, %d x %d = %d, %d x %d = %d", a, b, a*b, a, c, a*c, a, d, a*d, b, c, b*c, c, d, c*d);

        sc.close();
    }

}