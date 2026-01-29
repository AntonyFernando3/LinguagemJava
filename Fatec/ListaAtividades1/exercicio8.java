import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int a, b, c;

     System.out.println("Digite o primeiro número: ");
       a = entrada.nextInt();
    System.out.println("Digite o segundo número: ");
       b = entrada.nextInt();

       if(a > b){
        c = b % a;
        while (c != 0){
            b = a;
            a = c;
            c = b % a;
        }
        System.out.print("O máximo divisor comum é: " +a);
       } else {
        c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println("O máximo divisor comum é: "+b);
       }
    }
}
