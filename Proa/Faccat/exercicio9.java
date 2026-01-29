package Faccat;

// exercicio 9: Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[]args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite o valor atual do seu salario");

        float salario = sc.nextFloat();

        System.out.println("Digite o valor do reajuste");

        float reajuste = sc.nextFloat();

        float salarioFinal= salario + salario*reajuste/100;

        System.out.println("O novo salario corresponde e de: R$" + salarioFinal);

        sc.close();
    }
}
