package Faccat;

// Exercicio 21: Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFinal, duracao;

        System.out.println("Digite a hora de início do jogo: ");
        horaInicio = sc.nextInt();

        System.out.println("Digite a hora de fim do jogo: ");
        horaFinal = sc.nextInt();

        if (horaInicio >= horaFinal) {
            duracao = (horaFinal - horaInicio) + 24;
        } else {
            duracao = horaFinal - horaInicio;
        }

        System.out.printf("A partida durou %d horas.", duracao);

        sc.close();
    }

}