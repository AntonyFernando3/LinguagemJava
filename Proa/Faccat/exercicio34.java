package Faccat;

// Exercicio 34: Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:

import java.util.Scanner;

public class exercicio34 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor A");

        double valorA= sc.nextDouble();

        System.out.println("Digite o valor B");

        double valorB= sc.nextDouble();

        double valorZ= (valorA * valorB) + 5;

        if (valorZ<=0){
            System.out.println("A resposta é A");
        } else if (valorZ<=100){
            System.out.println("A resposta é B");
        } else {
            System.out.println("A resposta é C");
        }

        sc.close();
    }
}