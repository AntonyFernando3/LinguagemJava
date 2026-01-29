package Faccat;

// Exercicio 26: Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'.

import java.util.Scanner;

public class exercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estoqueAtual, estoqueMaximo, estoqueMinimo, estoqueMedio;

        System.out.println("Digite a quantida atual em estoque: ");
        estoqueAtual = sc.nextInt();

        System.out.println("Digite a quantida máxima em estoque: ");
        estoqueMaximo = sc.nextInt();

        System.out.println("Digite a quantida mínima em estoque: ");
        estoqueMinimo = sc.nextInt();

        estoqueMedio = (estoqueMinimo + estoqueMaximo) / 2;

        if (estoqueAtual >= estoqueMedio) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        sc.close();
    }

}