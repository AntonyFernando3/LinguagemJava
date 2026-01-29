import java.util.Scanner;

public class exercicio7 {
   public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    double media;
    int num, soma = 0, quant = 0;

    do {
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        soma = soma + num;
        quant++;
    } while (num >= 1);

    if (num >= 0) {
        media = soma / quant;
System.out.println("Soma: "+soma);
System.out.println("Média: "+media);
    }
  }
} 

