package Faccat;

// Exercicio 37: Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//Até 5 Kg Acima de 5 Kg
//Morango R$ 2,50 por Kg R$ 2,20 por Kg
//Maçã R$ 1,80 por Kg R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
//ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
//morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

import java.util.Scanner;

public class exercicio37 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de quilos de morango desejados");

        double morango = sc.nextDouble();

        System.out.println("Digite a quantidade de quilos de maçã desejados");

        double maca = sc.nextDouble();

        double totalQuilos= morango + maca;
        double precoTotal;
        double desconto;

        double totalMorango;
        double totalMaca;

        if (morango<=5){
            totalMorango= morango * 2.50;
        } else {
            totalMorango= morango * 2.20;
        }

        if (maca<=5){
            totalMaca= maca * 1.80;
        } else {
            totalMaca= maca * 1.50;
        }

        if (totalQuilos<=8){
            precoTotal= totalMorango + totalMaca;
        } else {
            desconto= (totalMorango + totalMaca) / 100 * 10;
            precoTotal= desconto + totalMorango + totalMaca;
        }

        System.out.println(morango + "Kg de morango: R$" + totalMorango + " / " + maca + "Kg de Maçã: R$" + totalMaca + " / Preço final: R$" + precoTotal);

        sc.close();
    }
}