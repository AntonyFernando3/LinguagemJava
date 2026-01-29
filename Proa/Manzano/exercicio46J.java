package Manzano;

// Questão 46 Exercicio J: Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
//pares situados na faixa numérica de 50 a 70.

public class exercicio46J {

    public static void main(String[]args){

        double num= 0;
        double cont= 0;


        for (int passo = 50; passo < 71; passo++){
            cont= num + passo;
            System.out.println(num + " + " + passo +  " =  " + cont);
            num= cont;
        }

        double media = cont / 20;
        System.out.println("Média dos numeros somados: " + media);
    }
}