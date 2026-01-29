import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];
        int maior = 0, menor = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Informe o valor: ");
            vetor[i] = entrada.nextInt();

            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
            } else {
                if (vetor[i] < menor) {
                    menor = vetor[i];
                } else if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    }
}