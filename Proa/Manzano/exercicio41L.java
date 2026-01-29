package Manzano;

// Questão 41 Exercicio L: Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
//saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
//mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da
//mensagem de saudação o nome previamente informado.

import java.util.Scanner;

public class exercicio41L {


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String nome= sc.nextLine();

        System.out.println("Digite (1) se for masculino ou (2) se for feminino");

        int sexo= sc.nextInt();

        if (sexo==1){
            System.out.println("olá senhor " + nome + " seja bem vindo!");
        } else if (sexo==2){
            System.out.println("olá senhora " + nome + " seja muito bem vinda!!!");
        }
        sc.close();
    }
}