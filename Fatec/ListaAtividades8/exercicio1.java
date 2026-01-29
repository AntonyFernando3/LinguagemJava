import java.util.Scanner;

public class exercicio1 {

static int somaElementos(int v[]) {
int soma = 0;

for(int i = 0; i < v.length; i++) {
soma += v[i];
}

return soma;
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
System.out.println("\nSomatória dos valores contidos no vetor: " + somaElementos(vetor) + "\n");
}
}