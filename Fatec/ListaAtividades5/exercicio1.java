import java.util.Scanner;

public class exercicio1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String frase;
System.out.println("Digite uma frase: ");
frase = sc.nextLine();
System.out.println("\nO tamanho da sua frase em caracteres é de:" + frase.length() + "\n");
sc.close();
}
}
