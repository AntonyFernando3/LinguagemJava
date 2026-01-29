package Faccat;

// Exercicio 25: Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

import java.util.Scanner;

public class exercicio25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int conta;

        double saldo, debito, credito, saldoAtual;

        System.out.println("Digite o número da conta: ");
        conta = sc.nextInt();

        System.out.println("Digite o saldo em reais: ");
        saldo = sc.nextDouble();

        System.out.println("Digite o debito em reais: ");
        debito = sc.nextDouble();

        System.out.println("Digite o credito em reais: ");
        credito = sc.nextDouble();

        saldoAtual = saldo - debito + credito;

        if (saldoAtual < 0) {
            System.out.println("Saldo negativo");
        } else {
            System.out.println("Saldo positivo");
        }

        sc.close();
    }

}