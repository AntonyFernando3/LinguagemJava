package Faccat;

//Exercicio 8: Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[]args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Descobrir o total de eleitores em porcentagem");

        System.out.println("Digite o numero total de eleitores no municipio");

        double total=sc.nextDouble();

        System.out.println("Digite o numero de votos em branco");

        double brancos=sc.nextDouble();

        System.out.println("Digite o numero de votos nulos");

        double nulos=sc.nextDouble();

        System.out.println("Digite o numero de votos validos");

        double validos=sc.nextDouble();

        double percentualA= (brancos / total) * 100;
        double percentualB= (nulos / total) * 100;
        double percentualC= (validos / total) * 100;

        System.out.println("Votos em branco: " + percentualA + "%; Votos nulos: " + percentualB + "%; Votos validos: " + percentualC + "%.");

        sc.close();
    }
}