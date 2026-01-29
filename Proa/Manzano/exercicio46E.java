package Manzano;

// Questão 46 Exercicio E: Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
//considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
//neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).

public class exercicio46E {

    public static void main(String[]args){

        int passo= 1;
        int expoente=1;
        double result=0;

        for (passo = 1; passo < 16; passo++){
            result = Math.pow(3,expoente);
            System.out.println("3 ^" + passo + " = " + result);
            expoente++;
        }
    }
}
