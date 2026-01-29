package Manzano;

// Questão 46 Exercicio C: Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.

public class exercicio46C {

        public static void main(String[]args){

                int num= 0;
                int cont= 0;
                int passo= 1;

                for (passo = 1; passo < 501; passo++){
                        if ((passo%2)==0){
                                cont = num + passo;
                                System.out.println(num + " + " + passo + " =  " + cont);
                                num = cont;
                        }
                }
        }
}