import java.util.Arrays; 
import java.util.Scanner; 

public class exercicio4 { 
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in); 

        double vetor[] = new double[10], copia[] = new double[3]; 
        int ind; 

        for (int i = 0; i < vetor.length; i++) { 
            System.out.println("Informe o valor " + i + ":"); 
            vetor[i] = entrada.nextDouble(); 
        } 

        System.out.println("De 0 a 9, escolha um índice: "); 

        ind = entrada.nextInt(); 

        if (ind <= 7) { 
            System.arraycopy(vetor, ind, copia, 0, copia.length); 
            System.out.println(Arrays.toString(copia)); 

        } else { 
        System.out.println("Erro: índice não permite copiar 3 números."); 
        } 
    } 
} 