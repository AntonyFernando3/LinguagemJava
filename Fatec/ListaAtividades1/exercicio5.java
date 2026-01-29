import java.io.IOException;
import java.util.Scanner;


public class exercicio5 {

  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
  
    char sexo;
    double h, peso;

    System.out.printf("Digite 'h' para HOMEM ou 'm' para MULHER: ");
    sexo = (char)System.in.read();
  

    System.out.printf("Informe a altura (em metros): ");
    h = ler.nextDouble();
  

    if (sexo == 'h') {
      peso = (72.7 * h) - 58;
      System.out.printf("O peso ideal é:  " +peso);
    } 
    
    else if (sexo == 'm') {
    peso = (62.1 * h) - 44.7;
    System.out.printf("O peso ideal é: " + peso);

    }
  }  
}