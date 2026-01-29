import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double m[][] = new double[3][4];
        int i, j;
        for (i = 2; i >= 0; i--) {
            System.out.println("\nInforme a linha " + i + " da matriz: ");
            for (j = 3; j >= 0; j--) {
                System.out.println("m[" + i + "][" + j + "]: ");
                m[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("\nResultado: ");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
