import java.util.Scanner;
public class exercicio1 {

    public static void ver(int x) {
        if (x == 0)
            System.out.println("O Valor é Nulo!");
        else if (x % 2 == 0)
            System.out.println("O Valor é Par!");
        else
            System.out.println("O Valor é ímpar!");
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um Valor: ");
        int x = ent.nextInt();
        ver(x);
        ent.close();
    }
}
