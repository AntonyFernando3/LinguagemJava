package Manzano;

// Questão 46 Exercicio H: Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
//10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
//programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
//é
//5
//+1609
//=
//C
//F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class exercicio46H {

    public static void main(String[]args){

        double celsius=0;
        double fahrenheit=0;

        for (celsius = 0; celsius < 101; celsius++) {
            if ((celsius % 10)==0) {
                fahrenheit = (celsius * 1.8) + 32;
                System.out.println(celsius + "C° = " + fahrenheit + "F°");
            }
        }


    }
}