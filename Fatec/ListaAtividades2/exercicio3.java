import java.util.Scanner; 

public class exercicio3 { 

    public static void main(String[] args) { 
      Scanner entrada = new Scanner(System.in); 

        int vetor1[] = new int[5], vetor2[] = new int[5], vetor3[] = new int[5]; 

        System.out.println("Para o primeiro vetor:"); 
        for (int i = 0; i < 5; i++) { 
            System.out.println("Informe o valor " + i + ":"); 
            vetor1[i] = entrada.nextInt(); 
        } 

        System.out.println("\nPara o segundo vetor:"); 
        for (int i = 0; i < 5; i++) { 
            System.out.println("Informe o valor " + i + ":"); 
            vetor2[i] = entrada.nextInt(); 
        }

        System.out.println("\nElementos do terceiro vetor:"); 
        for (int i = 0; i < 5; i++) { 
         vetor3[i] = vetor1[i] + vetor2[i]; 
            System.out.print(vetor3[i] + "\t"); 

        } 
    } 
} 