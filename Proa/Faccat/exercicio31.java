package Faccat;

// Exercicio 31: Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
//ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
//dos outros 2 lados.

import java.util.Scanner;

public class exercicio31 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Descobrir se o triangulo existe");

        System.out.println("Digite a medida do 1° lado");
        double lado1= sc.nextDouble();

        System.out.println("Digite a medida do 2° lado");
        double lado2= sc.nextDouble();

        System.out.println("Digite a medida do 3° lado");
        double lado3= sc.nextDouble();

        double soma1= lado1 + lado2;
        double soma2= lado1 + lado3;
        double soma3= lado2 + lado3;

        if (lado1>soma3){
            System.out.println("O triangulo não existe, pois o 1° lado é maior que a soma do 2° com o 3°");
        } else if (lado2>soma2){
            System.out.println("O triangulo não existe, pois o 2° lado é maior que a soma do 1° com o 3°");
        } else if (lado3>soma1){
            System.out.println("O triangulo não existe, pois o 3° lado é maior que a soma do 1° com o 2°");
        } else {
            System.out.println("O triangulo existe");
        }

        sc.close();
    }
}