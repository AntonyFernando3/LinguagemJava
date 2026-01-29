import java.util.Arrays; 
import java.util.Scanner; 

public class exercicio1 { 
    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        double vetor1[] = new double[3], vetor2[] = new double[3], vetor3[] = new double[6]; 
        double soma1 = 0.0, soma2 = 0.0; 
        System.out.println("Para o primeiro vetor:"); 

        for (int i = 0; i < vetor1.length; i++) { 
            System.out.println("Informe o valor " + i + ": "); 
            vetor1[i] = entrada.nextDouble(); 
            soma1 = soma1 + vetor1[i]; 
        } 

        System.out.println("\nPara o segundo vetor:"); 

        for (int i = 0; i < vetor2.length; i++) { 
            System.out.println("Informe o valor " + i + ": "); 
            vetor2[i] = entrada.nextDouble(); 
            soma2 = soma2 + vetor2[i]; 
        } 

        if (soma1 > soma2) { 
            for (int i = 0; i < vetor1.length; i++) { 
                vetor3[i] = vetor1[i]; 
                vetor3[i + 3] = vetor2[i]; 
            } 

        } else { 
            for (int i = 0; i < vetor2.length; i++) { 
                vetor3[i] = vetor2[i]; 
                vetor3[i + 3] = vetor1[i]; 
            } 
        } 
        System.out.println("\nVetor 3: " + Arrays.toString(vetor3)); 
    } 
} 