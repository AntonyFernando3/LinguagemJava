import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i;
        int v[] = new int[5];

        for (i = 0; i < 5; i++) {
            System.out.println("Digite o número: ");
            v[i] = entrada.nextInt();
        }
        
        System.out.println("A ordem inversa dos valores é: ");
        for(i=0; i<10; i++) {
        System.out.println("\n" +v[4-i]);
        }
    }
}
