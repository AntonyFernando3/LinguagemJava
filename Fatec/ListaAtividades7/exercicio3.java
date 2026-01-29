import java.util.Scanner;
public class exercicio3 {
    public static double imc(int p, double a) {
        double imc = p / (a * a);
        return imc;
    }

    public static void calc_imc(char x, double z) {
        if (x == 'f') {
            if (z < 19.1)
                System.out.println("Seu imc é: " + z + ". Abaixo do peso.");
            else if (z >= 19.1 && z < 25.8)
                System.out.println("Seu imc é: " + z + ". Normal.");
            else if (z >= 25.8 && z < 27.3)
                System.out.println("Seu imc é: " + z + ". Marginalmente acima do peso.");
            else if (z >= 27.3 && z < 31.1)
                System.out.println("Seu imc é: " + z + ". Acima do peso ideal.");
            else
                System.out.println("Seu imc é: " + z + ". Obeso.");
        } else if (x == 'm') {
            if (z < 20.7)
                System.out.println("Seu imc é: " + z + ". Abaixo do peso.");
            else if (z >= 20.7 && z < 26.4)
                System.out.println("Seu imc é: " + z + ". Normal.");
            else if (z >= 26.4 && z < 27.8)
                System.out.println("Seu imc é: " + z + ". Marginalmente acima do peso.");
            else if (z >= 27.8 && z < 32.3)
                System.out.println("Seu imc é: " + z + ". Acima do peso ideal.");
            else
                System.out.println("Seu imc é: " + z + ". Obeso.");
        } else
            System.out.println("Sexo inválido");
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite seu sexo(m ou f)");
        char s = ent.next().charAt(0);
        System.out.println("Digite seu peso");
        int p = ent.nextInt();
        System.out.println("Digite sua altura");
        double a = ent.nextDouble();
        double y = imc(p, a);
        calc_imc(s, y);
        ent.close();
    }
}
