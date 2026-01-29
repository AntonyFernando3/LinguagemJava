/**
 * 22/08/2022 - Exercicio 1
 */

import java.util.Scanner;

public class exemplo2 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int idade; 
    double altura, peso;
    
    System.out.println("Digite a sua idade: ");
    idade = entrada.nextInt();
    System.out.println("Digite seu Peso: ");
    peso = entrada.nextInt();
    System.out.println("Digite sua Altura: ");
    altura = entrada.nextInt();

    System.out.println("Você tem " + idade + " anos");
    System.out.println("Você tem " + peso + " de peso");
    System.out.println("Você tem " + altura + " de altura");

   }
    
}