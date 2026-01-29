import java.util.Scanner;

public class exercicio1 {
public static void main(String[] args){

int numero1, numero2, res = 0;
char opc;

Scanner entrada = new Scanner(System.in);
System.out.println("\033\143");

try {

System.out.println("Escolha uma das opções: \n");
System.out.print("+ ADIÇÃO \n- SUBTRAÇÃO \n* MULTIPLICAÇÃO \n/ DIVISÃO \n \n");
opc = entrada.next().charAt(0);

System.out.println("Digite o primeiro número: ");
numero1 = entrada.nextInt();

System.out.println("Digite o segundo número: ");
numero2 = entrada.nextInt();

entrada.close();

switch (opc) {
case '+':
res = (numero1 + numero2);
System.out.println("A soma dos valores é igual à: " + res + "\n");

break;
case '-':
res = (numero1 - numero2);
System.out.println("A subtração dos valores é igual à: " + res + "\n");

break;
case '*':
res = (numero1 * numero2);
System.out.println("A multiplicação dos valores é igual à: " + res + "\n");

break;
case '/':
try{
res = numero1 / numero2;
res = numero2 / numero1;
System.out.println("A divisão dos valores é igual à: " + res + "\n");
}

catch(Exception e){
System.err.println("ERRO: O divisor não pode ser zero!");

}

break;
default:
System.err.println("ERRO: Operador invalido" + "\n");
}

} catch (Exception e) {
System.err.println("ERRO: Número inválido!");
}
}
}