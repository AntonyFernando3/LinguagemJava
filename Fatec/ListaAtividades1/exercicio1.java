import java.util.Scanner;
import java.lang.Math;

public class exercicio1 {

public static void main(String[] args){ 
double raio;
double c,a,v;
final double pi=3.14;

Scanner entrada = new Scanner(System.in);
System.out.println("Digite o raio: ");
raio = entrada.nextDouble();

c = 2 * raio * pi;
a = pi * Math.pow(raio,2);
v = (3.0/4.0) * pi * Math.pow(raio,3);

System.out.println("Comprimento: " +c);
System.out.println("Área: " +a);
System.out.println("Volume: " +v);

}
}

