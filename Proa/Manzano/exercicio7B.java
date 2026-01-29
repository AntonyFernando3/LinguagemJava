package Manzano;

// Questao 7 Exercicio B: Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
//conversão é C ← (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celcius

import java.util.Scanner;

public class exercicio7B {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a tempertatura em graus Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        float celsius = ((fahrenheit - 32) / 9) * 5;

        System.out.printf("A temperatura %.1fº na escala Fahrenheit corresponde a %.1fº na escala Celsius;", fahrenheit,
                celsius);

        sc.close();
    }

}