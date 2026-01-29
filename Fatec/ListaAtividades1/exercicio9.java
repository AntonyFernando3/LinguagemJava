import java.io.IOException;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);
     
    double encerrar;
    int v = 7;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;
    int vn = 0;
    int vb = 0;

        System.out.printf(" \n ..... BEM VINDO A VOTAÇÃO ..... \n");

     System.out.printf(" \n 1. Antony");
     System.out.printf(" \n 2. Matheus");
     System.out.printf(" \n 3. Gabriele");
     System.out.printf(" \n 4. Thais");
     System.out.printf(" \n 5. Nulo");
     System.out.printf(" \n 6. Branco");

     System.out.printf(" \n \n Digite o número do seu candidato e tecle ENTER: ");
     v = leitor.nextInt();

     switch(v)
     {
      case 0:
      System.out.printf(" \n VOTAÇÃO ENCERRADA: ");
      break;

      case 1: 
      c1 = c1 +1;
      System.out.printf(" \n Você votou no candidato ANTONY \n");
      break;

      case 2: 
      c2 = c2 +1;
      System.out.printf(" \n Você votou no candidato MATHEUS \n");
      break;

      case 3: 
      c3 = c3 +1;
      System.out.printf(" \n Você votou na candidata GABRIELE \n");
      break;

      case 4: 
      c4 = c4 +1;
      System.out.printf(" \n Você votou na candidata THAIS \n");
      break;

      case 5: 
      vn = vn +1;
      System.out.printf(" \n VOTO NULO!");
      break;

      case 6: 
      vb = vb +1;
      System.out.printf(" \n VOTO BRANCO!");
      break;

      default:
      System.out.printf(" \n OPÇÃO INVALIDA!");
      break;
     }

     System.out.printf(" \n Antony: " +c1);
     System.out.printf(" \n Matheus: " +c2);
     System.out.printf(" \n Gabriele: " +c3);
     System.out.printf(" \n Thais: " +c4);
     System.out.printf(" \n Nulo: " +vn);
     System.out.printf(" \n Branco: " +vb);

     System.out.printf(" \n \n DIGITE 0 para encerrar: ");
     encerrar = leitor.nextInt();

    if (encerrar == '0'); {
    System.out.printf(" \n ...VOTAÇÃO ENCERRADA COM SUCESSO ...");
    } 
  }
}
     
   
  


