import java.util.Scanner;
public class exercicio2 {

    public static double imc(char s, int p, double a) {
        double imc = p / (a * a);
        return imc;
    }

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite seu sexo(m ou f)");
        char s = ent.next().charAt(0);
        System.out.println("Digite seu peso: ");
        int p = ent.nextInt();
        System.out.println("Digite sua altura: ");
        double a = ent.nextDouble();

        double imc = imc(s, p, a);
        if (s == 'f') {
            if (imc < 19.1)
                System.out.println("Seu imc é: " + imc + ". Abaixo do peso.");
            else if (imc >= 19.1 && imc < 25.8)
                System.out.println("Seu imc é: " + imc + ". Normal.");
            else if (imc >= 25.8 && imc < 27.3)
                System.out.println("Seu imc é: " + imc + ". Marginalmente acima do peso.");
            else if (imc >= 27.3 && imc < 31.1)
                System.out.println("Seu imc é: " + imc + ". Acima do peso ideal.");
            else
                System.out.println("Seu imc é: " + imc + ". Obeso.");
        } else if (s == 'm') {
            if (imc < 20.7)
                System.out.println("Seu imc é: " + imc + ". Abaixo do peso.");
            else if (imc >= 20.7 && imc < 26.4)
                System.out.println("Seu imc é: " + imc + ". Normal.");
            else if (imc >= 26.4 && imc < 27.8)
                System.out.println("Seu imc é: " + imc + ". Marginalmente acima do peso.");
            else if (imc >= 27.8 && imc < 32.3)
                System.out.println("Seu imc é: " + imc + ". Acima do peso ideal.");
            else
                System.out.println("Seu imc é: " + imc + ". Obeso.");
        } else
            System.out.println("Sexo inválido");
        ent.close();
    }
}
