package Manzano;

// Questão 26 Exercicio C: Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a
//apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para
//cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de
//votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e
//votos em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos
//válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de
//eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de
//eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de
//eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de
//eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último
//o percentual correspondente de votos em branco em relação à quantidade de eleitores.

import java.util.Scanner;

public class exercicio26C {

    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade de votos do canditado A");

        int candidatoA= sc.nextInt();

        System.out.println("Digite a quantidade de votos do candidato B");

        int candidatoB= sc.nextInt();

        System.out.println("Digite a quantidade de votos do candidato C");

        int candidatoC= sc.nextInt();

        System.out.println("Digite a quantidade de votos em branco");

        int brancos= sc.nextInt();

        System.out.println("Digite a quantidade de votos nulos");

        int nulos= sc.nextInt();

        int validos= candidatoA + candidatoB + candidatoC;
        int totalEleitores= validos + brancos + nulos;

        int porcentagemA= candidatoA * 100 / totalEleitores;
        int porcentagemB= candidatoB * 100 / totalEleitores;
        int porcentagemC= candidatoC * 100 / totalEleitores;
        int porcentagemValidos= validos * 100/ totalEleitores;
        int porcentagemNulos= nulos * 100 / totalEleitores;
        int porcentagemBrancos= brancos * 100 / totalEleitores;

        System.out.println("percentual correspondente de votos válidos: " + porcentagemValidos + "%");
        System.out.println("percentual correspondente de votos candidato A: " + porcentagemA + "%");
        System.out.println("percentual correspondente de votos candidato B: " + porcentagemB + "%" );
        System.out.println("percentual correspondente de votos candidato C: " + porcentagemC + "%");
        System.out.println("percentual correspondente de votos nulos: " + porcentagemNulos + "%");
        System.out.println("percentual correspondente de votos em branco: " + porcentagemBrancos + "%");

        sc.close();
    }
}