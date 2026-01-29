import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[3][3];
        int i, j;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe o valor para a linha " + i + " e a coluna " + j + ": ");
                m[i][j] = entrada.nextInt();
            }
            System.out.println("\n");
        }
        System.out.println("Matriz informada pelo usuário: ");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println("\n");
        }
        System.out.println("Matriz final: ");
        for (j = 0; j < 3; j++) {
            for (i = 2; i >=0; i--) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
