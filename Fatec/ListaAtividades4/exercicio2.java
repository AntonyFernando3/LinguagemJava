import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[3][3];
        int i, j;
        for (j = 0; j < 3; j++) {
            System.out.println("\nInforme a " + (j + 1) + "a. coluna: ");
            for (i = 0; i < 3; i++) {
                System.out.println("Linha " + (i + 1) + ": ");
                m[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nResultado: ");
        for (i = 0; i < m.length; i++) {
            System.out.println((i + 1) + "a. linha: ");
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
