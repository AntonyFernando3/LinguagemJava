import java.util.Scanner;

public class exercicio3 {
static void somaElementos(int m[][]) {

int somaDiag = 0;
int somaLinha = 0;

for(int i = 0; i < m.length; i++) {
for(int j = 0; j < m[i].length; j++) {
if (i == j) {

somaDiag += m[i][j];
}

somaLinha += m[i][j];
}

System.out.println("Soma da linha " + i + ": " + somaLinha);
somaLinha = 0;
}

System.out.println("Soma da diagonal principal: " + somaDiag + "\n");
}

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

System.out.println("\nInforme a quantidade de linhas da matriz:");
int lin = entrada.nextInt();

System.out.println("Informe a quantidade de colunas da matriz:");
int col = entrada.nextInt();

int matriz[][] = new int[lin][col];
for(int i = 0; i < matriz.length; i++) {
for(int j = 0; j < matriz[i].length; j++) {

System.out.println("Valor para matriz[" + i + "][" + j + "]:");
matriz[i][j] = entrada.nextInt();
}
}

entrada.close();
System.out.println("\n");
somaElementos(matriz);
}
}