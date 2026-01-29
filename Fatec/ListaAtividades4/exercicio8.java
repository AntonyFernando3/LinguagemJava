import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int[4][4], matrizB[][] = new int[4][4], matrizSoma[][] = new int[4][4];
        int i, j;
        System.out.println("Para a matriz A: ");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA[i].length; j++) {
                System.out.println("Informe o valor para a linha " + i + " e a coluna " + j + ": ");
                matrizA[i][j] = entrada.nextInt();
            }
            System.out.println("\n");
        }
        System.out.println("Para a matriz B: ");
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB[i].length; j++) {
                System.out.println("Informe o valor para a linha " + i + " e a coluna " + j + ": ");
                matrizB[i][j] = entrada.nextInt();
            }
            System.out.println("\n");
        }
        System.out.println("Soma de A + B:");
        for (i = 0; i < matrizSoma.length; i++) {
            for (j = 0; j < matrizSoma[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

