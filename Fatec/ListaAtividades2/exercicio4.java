import java.util.Scanner; 

public class exercicio4 { 
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in); 

        double nota[] = new double[100]; 
        int lidos = 0, acima = 0; 
        double soma = 0.0, media; 

        for (int i = 0; i < 100; i++) { 
            System.out.println("Informe a nota " + i + ":"); 
            nota[i] = entrada.nextDouble(); 
            if (nota[i] == -1) { 
                break; 
            } 

            lidos = lidos + 1; 
            soma = soma + nota[i]; 
        } 

        System.out.println("\nQuantidade de valores lidos: " + lidos); 
        System.out.println("\nValores na ordem em que foram informados:"); 

        for (int i = 0; i < lidos; i++) { 
            System.out.println("Posição " + i + ": " + nota[i]); 
        } 

        System.out.println("\nValores na ordem inversa à que foram informados:"); 

        for (int i = 0; i < lidos; i++) { 
            System.out.println("Posição " + i + ": " + nota[lidos - (i + 1)]); 
        } 

        System.out.println("\nSoma dos valores: " + soma); 
        media = soma / lidos; 

        System.out.println("\nMédia dos valores: " + media); 
        for (int i = 0; i < lidos; i++) { 
            if (nota[i] > media) { 
                acima = acima + 1; 
            } 
        } 

        System.out.println("\nQuantidade de valores acima da média: " + acima); 
    } 
} 