import java.util.Scanner;
public class exercicio4 {

    public static int calcFatorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = ent.nextInt();
        if (n >= 0)
            System.out.println("O fatorial de " + n + " é " + calcFatorial(n));
        else
            System.out.println("Digite um número válido");
        ent.close();
    }
}
