package Faccat;

// Exercicio 43: Seja o seguinte algoritmo:
//inicio
//ler a, b, c
//se (a < b+c) e (b <a+c) e (c <a+b) então
//se (a=b) e (b=c) então
//mens  'Triângulo Equilátero'
//senão
//se (a=b) ou (b=c) ou (a=c) então
//mens  'Triângulo Isósceles'
//senão
//mens  'Triângulo Escaleno'
// fim_se
// fim_se
//senão
//mens  'Não e possível formar um triângulo'
//fim_se
//escrever mens
//fim
//Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das variáveis:

import java.util.Scanner;

public class exercicio43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");

        int a = sc.nextInt();

        System.out.println("Digite o valor de B");

        int b = sc.nextInt();

        System.out.println("Digite o valor de C");

        int c = sc.nextInt();

        int soma1= a+b;
        int soma2= a+c;
        int soma3= b+c;

        if (a>soma3){
            System.out.println("O triangulo não existe, pois o 1° lado é maior que a soma do 2° com o 3°");
        } else if (b>soma2){
            System.out.println("O triangulo não existe, pois o 2° lado é maior que a soma do 1° com o 3°");
        } else if (c>soma1){
            System.out.println("O triangulo não existe, pois o 3° lado é maior que a soma do 1° com o 2°");
        } else {
            if (a == b && a == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }

        sc.close();
    }
}
