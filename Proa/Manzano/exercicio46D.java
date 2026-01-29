package Manzano;

// Questão 46 Exercicio D: Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
//se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
//se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.

public class exercicio46D {

    public static void main(String[]args){

        System.out.println("numeros impares entre 0 e 20");

        int num;

        for (num = 1; num < 21; num++)
            if((num%2)!=0){
                System.out.println(num);

            }
    }
}