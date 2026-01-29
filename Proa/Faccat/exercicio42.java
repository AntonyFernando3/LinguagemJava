package Faccat;

// Exercicio 42:  Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:
// - Ter no mínimo 65 anos de idade.
// - Ter trabalhado no mínimo 30 anos.
// - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
//de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
//de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'

import java.util.Scanner;

public class exercicio42 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu codigo de empregado");

        int codigo= sc.nextInt();

        System.out.println("Digite seu ano de nascimento");

        int anoDeNascimento= sc.nextInt();

        System.out.println("Digite seu ano de entrada na empresa");

        int anoDeEntrada= sc.nextInt();

        System.out.println("Digite o ano atual");

        int anoAtual= sc.nextInt();

        int idade= anoAtual - anoDeNascimento;
        int anosTrabalhados= anoDeEntrada - anoDeNascimento;

        if (idade>=65){
            System.out.println("Você pode pedir aposentadoria, pois possui " + idade + " anos.");
        } else if (anosTrabalhados>=30){
            System.out.println("Você pode pedir aposentadoria, pois trabalhou " + anosTrabalhados + " anos.");
        } else if(idade>=60 && anosTrabalhados>=25){
            System.out.println("Você pode pedir aposentadoria, pois trabalhou " + anosTrabalhados + " anos e possui " + idade + " anos.");
        } else {
            System.out.println("Você não pode pedir aposentadoria, pois possui os requisitos minimos");
        }

        sc.close();
    }
}