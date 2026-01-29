import java.util.Arrays;
import java.util.Scanner;

public class exercicio5 {
static void insertionSort(int v[]) {

int j;
int key;
int i;

for (j = 1; j < v.length; j++) {
key = v[j];
for (i = j - 1; (i >= 0) && (v[i] > key); i--) {
v[i + 1] = v[i];
}

v[i + 1] = key;
}

System.out.println("\nVetor em ordem crescente: " + Arrays.toString(v) + "\n");
}

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

System.out.println("\nInforme a quantidade de elementos do vetor:");
int n = entrada.nextInt();
int vetor[] = new int[n];

for(int i = 0; i < vetor.length; i++) {
System.out.println("Valor para vetor[" + i + "]:");
vetor[i] = entrada.nextInt();
}

entrada.close();
insertionSort(vetor);
}
}