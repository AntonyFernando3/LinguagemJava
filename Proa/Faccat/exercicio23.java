package Faccat;

// Exercicio 13: Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém
//erros, identifique os erros no algoritmo apresentado abaixo:
//Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
//e mostre seu peso ideal, utilizando as seguintes fórmulas:
// - para sexo masculino: peso ideal = (72.7 * altura) - 58
// - para sexo feminino: peso ideal = (62.1 * altura) - 44.7
//inicio
//ler nome
//ler sexo
//se sexo = M então
//peso_ideal  (72.7 * altura) - 58
//senão
//peso_ideal  (62.1 * altura) – 44.7
// fim_se
//escrever peso_ideal
//fim

import java.util.Scanner;

public class exercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char sexo;
        String nome;
        float altura, pesoIdeal;

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o seu sexo (M/F): ");
        sexo = sc.next().charAt(0);

        System.out.println("Digite a sua altura em metros: ");
        altura = sc.nextFloat();

        if (sexo == 'm' || sexo == 'M')  {
            pesoIdeal = (72.7f * altura) - 58;
        } else {
            pesoIdeal = (62.1f * altura) - 44.7f;
        }

        System.out.printf("O seu peso ideal é %.2fkg.", pesoIdeal);

        sc.close();
    }
}