
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota1, nota2;
        double media;

        System.out.println("Digite a nota 1: ");
    nota1 = entrada.nextInt();
        System.out.println("Digite a nota 2: ");
    nota2 = entrada.nextInt();
 
      media = (nota1+nota2) / 2;

    if( media >= 0.0 && media <= 3.9 ) {
    System.out.println("Reprovado: "+ media); 
    
   } else if ( media >= 4.0 && media <= 6.9 ) {
   System.out.println("Exame: " + media  ); 
     
   } else if ( media >= 7 )
    System.out.println("Aprovado: " + media  );

}
}
