import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[2][4];
        int i, j, qtdadeLinha = 0, qtdadeTotal = 0;
        double valorPar = 0.0, media;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe o valor para a linha " + i + " e a coluna " + j + ": ");
                m[i][j] = entrada.nextInt();
                if (m[i][j] % 2 == 0) {
                    qtdadeLinha = qtdadeLinha + 1;
                    qtdadeTotal = qtdadeTotal + 1;
                    valorPar = valorPar + m[i][j];
                }
            }
            System.out.println("Quantidade de elementos pares: " + qtdadeLinha);
            qtdadeLinha = 0;
            System.out.println("\n");
        }
        media = valorPar / qtdadeTotal;
        System.out.println("Média dos elementos pares da matriz: " + media);
    }
}
