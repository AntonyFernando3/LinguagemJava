import java.util.Scanner;

public class exercicio3{
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

int num;
String str;

try {

System.out.print("Digite um número: ");
str = entrada.nextLine();
num = Integer.parseInt(str);

System.out.println("Numero: "+num);
entrada.close();

} catch (Exception e) {
System.out.println("Digite um valor valido!");
}
}
}