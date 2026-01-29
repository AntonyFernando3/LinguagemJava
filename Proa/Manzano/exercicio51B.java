package Manzano;

// Questão 51 Exercicio B: Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.

public class exercicio51B {

    public static void main(String[]args){

        int numero=0;
        int soma=0;
        int resultado=0;

        for (numero = 0; numero < 501; numero++) {
            if ((numero%2)==0) {
                resultado = soma + numero;
                System.out.println(soma + " + " + numero + " = " + resultado);
                soma=resultado;
            }
        }


    }
}
