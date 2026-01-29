package Manzano;

// Questão 46 Exercicio K: Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
//banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
//nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
//do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
//calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
//total acumulado da área residencial.

import java.util.Scanner;

public class exercicio46K {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        double areaTotal=0;

        int sair=1;
        while (sair==1){
            System.out.println("Digite o nome do comodo");
            String nome= sc.nextLine();
            System.out.println("Digite a largura do comodo em metros");
            double largura= sc.nextDouble();
            System.out.println("Digite a profundidade do comodo em metros");
            double profundidade= sc.nextDouble();

            double areaComodo= largura * profundidade;
            System.out.println("área do " + nome + "M²");

            areaTotal += areaComodo;
            System.out.println("Deseja continuar calculando? 1 para sim 2 para não");
            sair= sc.nextInt();
        }

        System.out.println("área total da casa: " + areaTotal + "m²");

        sc.close();
    }
}