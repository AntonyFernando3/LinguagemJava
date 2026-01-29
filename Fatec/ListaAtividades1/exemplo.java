import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         double nota[] = new double[10];
          double ac = 0.0, m, maior = 0.0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um nota: ");
            nota[i] = entrada.nextDouble();
            ac = ac + nota[i];

            if(nota[i] > maior){
                maior = nota[i];
            } 
        }

        m = ac / 10;
       for(int i = 0; i < 10; i++) {
        System.out.println("As notas inseridas é: " +nota[i]);
       }
       System.out.println("A maior nota é: "+maior);
       System.out.println("A média geral da turma  é: "+m);
    }
}
