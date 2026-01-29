package Manzano;

//Questão 26 Exercicio A: Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e
//D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro
//valor, e o resultado do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma
//(variável S) do segundo com o quarto valor.


import java.util.Scanner;

public class exercicio26A {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor A");

        double valorA= sc.nextDouble();

        System.out.println("Digite o valor B");

        double valorB= sc.nextDouble();

        System.out.println("Digite o valor C");

        double valorC= sc.nextDouble();

        System.out.println("Digite o valor D");

        double valorD= sc.nextDouble();

        double produtoP= valorA * valorC;
        double somaP= valorA + valorC;
        double somaS= valorB + valorD;

        System.out.println("produto P: " + produtoP + " soma P: " + somaP + " soma S: " + somaS);

        sc.close();
    }
}
