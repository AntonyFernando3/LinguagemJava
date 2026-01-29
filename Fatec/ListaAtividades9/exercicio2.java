import java.util.Scanner;

public class exercicio2 {
public static void main(String args[]) {

System.out.println("\033\143");
Scanner entrada = new Scanner(System.in);

int linha, coluna;
char op;

do{
System.out.print("Digite a quantidade de linhas da matriz: ");
linha = entrada.nextInt();

System.out.print("Digite a quantidade de colunas da matriz: ");
coluna = entrada.nextInt();

double matriz[][] = new double[linha][coluna];
for (int i = 0; i < linha; i++) {
for (int j = 0; j < coluna; j++) {

System.out.print("linha [" + i + "] coluna [" + j + "]: ");
matriz[i][j] = entrada.nextDouble();
}
}

System.out.println("Números inseridos na matriz.:");

for (int i = 0; i < linha; i++) {
System.out.print("\n |");

for (int j = 0; j < coluna; j++) {
System.out.print(matriz[i][j]);

if (j < coluna -1) {
System.out.print(", ");

}else{
System.out.print("|");
}
}
}

System.out.print("\nDigite a linha do indice: ");
linha = entrada.nextInt();

System.out.print("Digite a coluna do indice: ");
coluna = entrada.nextInt();

imprimePosicao(matriz, linha, coluna);
do{

System.out.println("\nDeseja acessar mais uma vez? s/n:");
op = entrada.next().charAt(0);
op = Character.toLowerCase(op);

if(op !='s' && op!='n'){
System.out.print("\nDigite uma opção válida!\n");
}

}while(op !='s' && op!='n');
}while(op == 's');

entrada.close();
}

static void imprimePosicao(double matrix[][], int l, int c) {
double posicao;

try {
posicao = matrix[l][c];
System.out.println("Linha: " +(l+1)+ " [" + l + "]\nColuna: " +(c+1)+ "° [" + c + "] =\n" + posicao);

} catch (Exception e) {
System.out.println("Índice inválido!");
}
}
}


