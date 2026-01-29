package Faccat;

// Exercicio 32: Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class exercicio32 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do time 1");

        String time1= sc.nextLine();

        System.out.println("Digite a quantidade de gols do time 1");

        int gols1= sc.nextInt();

        System.out.println("Digite o nome do time 2");

        String time2= sc.nextLine();

        System.out.println("Digite a quantidade de gols do time 2");

        int gols2= sc.nextInt();

        if (gols1>gols2){
            System.out.println(time1 + " venceu o " + time2 + " por " + gols1 + " x " + gols2);
        } else if (gols2>gols1){
            System.out.println(time2 + " venceu o " + time1 + " por " + gols2 + " x " + gols1);
        } else {
            System.out.println(time1 + " empatou com o " + time2 + " por " + gols1 + " x " + gols2);
        }

        sc.close();
    }
}