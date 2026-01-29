import java.util.Scanner;
public class exercicio5 {

    public static void qtd_seg(int h) {
        System.out.println("O Total em segundos é: " + (h * 3600));
    }

    public static void qtd_seg(int h, int m) {
        System.out.println("O Total em segundos é: " + ((h * 3600) + (m * 60)));
    }

    public static void qtd_seg(int h, int m, int s) {
        System.out.println("O Total em segundos é: " + ((h * 3600) + (m * 60) + s));
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println(
                "Escolha o formato da Hora: (1) para apenas hora. (2) para hora e minuto. (3) para hora, minuto e segundo");
        int form = ent.nextInt();
        if (form == 1) {
            System.out.println("Digite a Hora: ");
            int h = ent.nextInt();
            qtd_seg(h);
        } else if (form == 2) {
            System.out.println("Digite a Hora: ");
            int h = ent.nextInt();
            System.out.println("Digite os Minutos: ");
            int m = ent.nextInt();
            qtd_seg(h, m);
        } else if (form == 3) {
            System.out.println("Digite a Hora: ");
            int h = ent.nextInt();
            System.out.println("Digite os Minutos: ");
            int m = ent.nextInt();
            System.out.println("Digite os Segundos: ");
            int s = ent.nextInt();
            qtd_seg(h, m, s);
        } else
            System.out.println("Formato inválido");
        ent.close();
    }
}
