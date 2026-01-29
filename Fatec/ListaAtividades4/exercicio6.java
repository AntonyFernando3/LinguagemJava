import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[3][3];
        int i, j;
        int somaLinha[] = new int[3], somaColuna[] = new int[3];
        int somaDiagonais, diagPrincipal = 0, diagSecundaria = 0;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe o valor para a linha " + i + " e a coluna " + j + ": ");
                m[i][j] = entrada.nextInt();
                somaLinha[i] = somaLinha[i] + m[i][j];
            }
            System.out.println("\n");
        }
        for (j = 0; j < 3; j++) {
            for (i = 0; i < m.length; i++) {
                somaColuna[j] = somaColuna[j] + m[i][j];
            }
        }
        for (i = 0; i < m.length; i++) {
            for (j = m[i].length; j >= 0; j--) {
                if (i == j) {
                    diagPrincipal = diagPrincipal + m[i][j];
                    if (i == 1 && j == 1) {
                        diagSecundaria = diagSecundaria + m[i][j];
                    }
                } else if (i == 0 && j == 2) {
                    diagSecundaria = diagSecundaria + m[i][j];
                } else if (i == 2 && j == 0) {
                    diagSecundaria = diagSecundaria + m[i][j];
                }
            }
        }
        somaDiagonais = diagPrincipal + diagSecundaria;
        System.out.println("Soma dos elementos da diagonal principal e da diagonal secundária: " + somaDiagonais);
        System.out.println("\nSoma dos elementos de cada uma das linhas: ");
        for (i = 0; i < m.length; i++) {
            System.out.println("Linha " + i + ": " + somaLinha[i]);
        }
        System.out.println("\nSoma dos elementos de cada uma das colunas: ");
        for (j = 0; j < 3; j++) {
            System.out.println("Coluna " + j + ": " + somaColuna[j]);
        }
    }
}
