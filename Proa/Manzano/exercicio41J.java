package Manzano;

// Questão 41 Exercicio J: Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a
//leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens: "O
//valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem "O valor
//está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.

import java.util.Scanner;

public class exercicio41J {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");

        int val= sc.nextInt();

        if (val>=1 && val<=9){
            System.out.println("o valor " + val + " está na faixa permitida");
        } else {
            System.out.println("o valor " + val + " está fora da faixa permitida");
        }
        sc.close();
    }
}