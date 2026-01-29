package Manzano;

// Questao 7 Exercicio D: Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
//automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
//(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
//distância percorrida com a fórmula DISTANCIA ← TEMPO * VELOCIDADE. Possuindo o valor da
//distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
//LITROS_USADOS ← DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
//média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
//quantidade de litros (LITROS_USADOS) utilizada na viagem

import java.util.Scanner;

public class exercicio7D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tempo, velocidade, distancia;

        System.out.println("Digite o tempo gasto na viagem em horas: ");
        tempo = sc.nextInt();

        System.out.println("Digite a velocidade média durante a viagem em km/hora: ");
        velocidade = sc.nextInt();

        distancia = tempo * velocidade;

        float litrosUsados = distancia / 12;

        System.out.printf("A velocidade média do carro durante a viagem foi %d km/h; \n O tempo gasto durante a viagem foi %d horas; \n A distância percorrida foi de %d quilometros; \n A quantida de litros gastos durante a viagem foi de %.1f", velocidade, tempo, distancia, litrosUsados);

        sc.close();
    }

}