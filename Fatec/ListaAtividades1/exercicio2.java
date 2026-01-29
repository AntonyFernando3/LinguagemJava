import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args){ 
        
        double valor, taxa, tempo, prest;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Valor: ");
        valor = entrada.nextInt();
        
        System.out.println("Digite o Taxa: ");
        taxa = entrada.nextInt();
       
        System.out.println("Digite o tempo: ");
        tempo = entrada.nextInt();

        prest =  valor + ( valor * ( taxa / 100 ) * tempo );

        System.out.println("A prestação em atraso é de: " +prest );
    }
}


