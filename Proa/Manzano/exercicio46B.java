package Manzano;

// Questão 46 Exercicio B: Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

public class exercicio46B {

    public static void main(String[]args){

        int num= 0;
        int cont= 0;
        int passo= 1;

        for (passo = 1; passo < 101; passo++){
            cont= num + passo;
            System.out.println(num + " + " + passo +  " =  " + cont);
            num= cont;
        }
    }
}