import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char m[][] = new char[5][5];
        int i, j, validacao = 0;
        char letra;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe um caractere para a linha " + i + " e a coluna " + j + ": ");
                m[i][j] = entrada.next().charAt(0);
            }
            System.out.println("\n");
        }
        System.out.println("Digite uma letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("\n");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                if (letra == m[i][j]) {
                    System.out.println("A letra se encontra na posição: m[" + i + "][" + j + "]");
                    validacao = 1;
                } else {
                    if (i == 4 && j == 4 && validacao != 1) {
                        System.out.println("A letra não foi encontrada em nenhuma posição da matriz.");
                    }
                }
            }
        }
    }
}
