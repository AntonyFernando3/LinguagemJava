package Manzano;

// Questao 7 Exercicio C: Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//Volume Raio ** Altura

import java.util.Scanner;

public class exercicio7C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura da lata em centimetros: ");
        float altura = sc.nextFloat();

        System.out.println("Digite o raio da lata em centímetros: ");
        float raio = sc.nextFloat();

        float volume = (float) (Math.PI * (raio * raio) * altura);

        System.out.printf("O volume da lata é de %.1fcm³.", volume);

        sc.close();
    }
}