import java.util.Scanner;

public class exercicio4 {
static void buscaValor(int vet[], int val) {

for(int i = 0; i < vet.length; i++) {
if (vet[i] == val) {

System.out.println("O valor se encontra no índice " + i + " do vetor.\n");
break;
} else if (i == vet.length - 1) {
System.out.println("O valor informado não existe no vetor! \n");
}
}
}

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

System.out.println("\nInforme a quantidade de elementos do vetor: ");
int n = entrada.nextInt();
int vetor[] = new int[n];

for(int i = 0; i < vetor.length; i++) {
System.out.println("Valor para vetor[" + i + "]:");
vetor[i] = entrada.nextInt();
}

System.out.println("\nInforme o valor que deseja encontrar no vetor: ");
int valor = entrada.nextInt();
entrada.close();
buscaValor(vetor, valor);
}
}