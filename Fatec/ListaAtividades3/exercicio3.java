import java.util.Arrays; 
import java.util.Scanner; 

public class exercicio3 { 
    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        int vetor[] = new int[9], invertido[] = new int[vetor.length]; 

        for (int i = 0; i < vetor.length; i++) { 
            System.out.println("Informe o valor " + i + ":"); 
            vetor[i] = entrada.nextInt(); 
        } 

        for (int i = 0; i < vetor.length; i++) { 
            invertido[i] = vetor[8 - i]; 
        } 

        System.out.println("Vetor invertido: " + Arrays.toString(invertido)); 

    } 
} 
