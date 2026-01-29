import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int v[] = new int[15], i, soma=0, media=0; 
   
        for(i=0; i<15; i++) {
            System.out.printf("Digite um número: ");
           v[i] = entrada.nextInt();
        
           soma=soma+v[i];
           media=soma/15;
        }
        System.out.printf("\n A soma dos valores é: "+soma);
        System.out.printf("\n A média é: "+media);

    }
}
