package Manzano;

// Questao 7 Exercicio A: Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
//conversão é F ← (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class exercicio7A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tempertatura em graus Celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheit = (celsius * 9 + 160) / 5;

        System.out.printf("A temperatura %.1fº na escala Celsius corresponde a %.1fº na escala Fahrnheit;", celsius,
                fahrenheit);

        sc.close();
    }

}
