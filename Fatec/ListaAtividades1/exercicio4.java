import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    float n1, n2, media, diferenca, produto;
    int opcao;

    System.out.println("Entre com dois numeros: ");
    n1 = entrada.nextInt();
    n2 = entrada.nextInt();

    System.out.println("Escolha umas das opções: ");
    System.out.println("1 - Media entre os numero digitados: ");
    System.out.println("2 - Diferença do maior pelo menor: ");
    System.out.println("3 - Produto entre os numeros digitados: ");
    System.out.println("4 - Divisao do primeiro pelo segundo: ");
    opcao = entrada.nextInt();

    switch(opcao) {

        case 1:
       media = (n1+n2) / 2;
        System.out.printf(" \n A média dos números é: " +media);
        break;

        case 2:
       diferenca= n1-n2;
        System.out.println("\n A diferença do maior pelo menor: " +diferenca);
        break;

        case 3:
       produto=n1*n2;
        System.out.println("\n O produto entre os numeros digitados é: " +produto);
        break;

        default:
      System.out.printf(" \n OPÇÃO INVALIDA!");
        break;
    } 
  }
}
    

