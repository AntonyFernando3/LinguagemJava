import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[3][6];
        int i, j, maior = 0, linhaMaior = 0, colunaMaior = 0, menor = 0, linhaMenor = 0, colunaMenor = 0;
        for (i = 0; i < m.length; i++) {
            System.out.println("\nInforme a linha " + i + " da matriz: ");
            for (j = 0; j < m[i].length; j++) {
                System.out.println("m[" + i + "][" + j + "]: ");
                m[i][j] = entrada.nextInt();
                if (i == 0 && j == 0) {
                    maior = m[i][j];
                    menor = m[i][j];
                } else {
                    if (m[i][j] > maior) {
                        maior = m[i][j];
                        linhaMaior = i;
                        colunaMaior = j;
                    } else if (m[i][j] < menor) {
                        menor = m[i][j];
                        linhaMenor = i;
                        colunaMenor = j;
                    }
                }
            }
        }
        System.out.println("\nMaior elemento da matriz: " + maior + " - Posição: m[" + linhaMaior + "][" + colunaMaior + "]");
        System.out.println("Menor elemento da matriz: " + menor + " - Posição: m[" + linhaMenor + "][" + colunaMenor + "]");
    }
}
