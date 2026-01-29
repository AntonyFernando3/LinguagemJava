package Faccat;

// Exercicio 22: A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salarioHora, salarioMensal;
        int horasTrabalhadas;

        System.out.println("Digite o salário / hora do funcionário em reais: ");
        salarioHora = sc.nextFloat();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextInt();

        if (horasTrabalhadas > 160) {
            salarioMensal = (160 + (horasTrabalhadas - 160) * 1.5f) * salarioHora;
        } else {
            salarioMensal = horasTrabalhadas * salarioHora;
        }

        System.out.printf("O salário a receber do funcionário neste mês é de R$ %.2f ;", salarioMensal);

        sc.close();
    }

}