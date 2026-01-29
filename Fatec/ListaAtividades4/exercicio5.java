import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota[][] = new double[10][5];
        int i, j;
        double somaAluno = 0.0, mediaAluno, somaClasse = 0.0, mediaClasse;
        for (i = 0; i < nota.length; i++) {
            System.out.println("\nAluno " + (i + 1) + ": ");
            for (j = 0; j < nota[i].length; j++) {
                System.out.println((j + 1) + "a. prova: ");
                nota[i][j] = entrada.nextInt();
                somaAluno = somaAluno + nota[i][j];
            }
            mediaAluno = somaAluno / 5.0;
            if (mediaAluno >= 6) {
                System.out.println("Média aritmética das cinco provas: " + mediaAluno);
                System.out.println("Situação: aprovado.");
            } else {
                System.out.println("Média aritmética das cinco provas: " + mediaAluno);
                System.out.println("Situação: reprovado.");
            }
            somaClasse = somaClasse + mediaAluno;
            somaAluno = 0.0;
        }
        mediaClasse = somaClasse / 10.0;
        System.out.println("\nMédia da classe: " + mediaClasse);
    }
}
