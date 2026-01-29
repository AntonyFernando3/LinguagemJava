import java.util.Scanner;
public class exemplo3{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[5];
        double valores[] = {1.3, 7.5, 2,0};

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Valores inseridos: ");
        for(int i = 0; i< 5; i++){
            System.out.println(vetor[i]);
        }
    }

}