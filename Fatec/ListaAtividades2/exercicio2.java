import java.util.Scanner; 

public class exercicio2 { 

    public static void main(String[] args) {      

        Scanner entrada = new Scanner(System.in); 

        int n, par = 0, impar = 0; 
        do { 
            System.out.println("Informe a quantidade de valores que deseja inserir:"); 
            n = entrada.nextInt(); 
        } while (n <= 0); 

        int vetor[] = new int[n]; 
        for (int i = 0; i < n; i++) { 
            System.out.println("Informe o valor " + i + ":"); 
            vetor[i] = entrada.nextInt(); 
            if (vetor[i] % 2 == 0) { 
                par = par + 1; 
            } else { 
                impar = impar + 1; 
            } 
        } 
        System.out.println("Quantidade de valores pares: " + par); 
        System.out.println("Quantidade de valores ímpares: " + impar); 
    } 
} 