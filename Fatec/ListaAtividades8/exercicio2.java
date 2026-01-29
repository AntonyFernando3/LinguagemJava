import java.util.Scanner;

public class exercicio2 {
static void somaElementos(double m[][]) {

double soma = 0;

for(int i = 0; i < m.length; i++) {
for(int j = 0; j < m[i].length; j++) {
soma += m[i][j];
}
}

System.out.println("\nSomatória dos valores contidos na matriz: " + soma + "\n");
}

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

System.out.println("\nInforme a quantidade de linhas da matriz: ");
int lin = entrada.nextInt();

System.out.println("Informe a quantidade de colunas da matriz: ");
int col = entrada.nextInt();

double matriz[][] = new double[lin][col];
for(int i = 0; i < matriz.length; i++) {
for(int j = 0; j < matriz[i].length; j++) {

System.out.println("Valor para matriz[" + i + "][" + j + "]:");
matriz[i][j] = entrada.nextDouble();
}
}

entrada.close();
somaElementos(matriz);
}
}