package Faccat;

import java.util.Scanner;

//exercicio 10: Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
//área do retângulo

public class exercicio10 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o nome do carro");

        String nome= sc.nextLine();

        System.out.println("Digite o preco de fabrica do carro");

        float carro= sc.nextFloat();

        float total = ((carro/100)*28) + ((carro/100)*45) + carro ;

        System.out.println("O preco de mercado do carro " + nome + " e: R$" + total);

        sc.close();
    }
}