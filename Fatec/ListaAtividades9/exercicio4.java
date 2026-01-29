import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio4{
static Scanner entrada = new Scanner(System.in);
static double valor, saldo=1000.00;
static DecimalFormat grana = new DecimalFormat("R$,###,###,##0.00");
static int operacao=0, erro=0;

public static void main(String[] args) {
System.out.println("\033\143");

try{
System.out.println("Escolha a operação desejada:\n(1) Sacar \n(2) Depositar \n(3) Verificar saldo \n(4) Sair \n");
operacao=entrada.nextInt();
}

catch(Exception e){
entrada.next();
main(null);
}

if(operacao == 1){
saque();
operacao=0;
}

if(operacao == 2){
deposito();
operacao=0;
}

if(operacao == 3){
saldo_atual(saldo);
operacao=0;
}

if(operacao == 4){
sair();
operacao=0;
}

entrada.close();
}

public static void saque() {
System.out.println("\033\143");

try{
System.out.print("Digite o valor que deseja sacar: ");
valor=entrada.nextDouble();
}

catch(Exception e){
entrada.next();
saque();
}

if(valor>saldo){
System.out.println("Saldo insulficiente");
operacao=0;
finalizar();

}else{

try{
System.out.println("Deseja confirmar o saque no valor de "+grana.format(valor)+"?\n(1) Sim\t(2) Não");
operacao=entrada.nextInt();

if(operacao==1){
System.out.println("Saque realizado com sucesso!");
saldo-=valor;

System.out.println("Saldo atual: "+grana.format(saldo));
operacao=0;
finalizar();

}else {
operacao=0;
finalizar();
}
}

catch(Exception e){
entrada.next();
saque();
}
}
}

public static void deposito() {
System.out.println("\033\143");

try{
System.out.print("Digite o valor que deseja depositar: ");
if(erro==1){
System.out.print("\nDigite um valor valido: ");
}

valor=entrada.nextDouble();
}

catch(Exception e){
entrada.next();
erro=1;
deposito();
}

if(valor<2){
System.out.println("O valor mínimo que pode ser depositado é R$2,00");

}else{
System.out.println("Deseja confirmar o deposito de "+grana.format(valor)+"?\n(1) Sim\t(2) Não");
operacao=entrada.nextInt();
saldo+=valor;
System.out.println("Deposito realizado com sucesso.\nSaldo atual: "+grana.format(saldo));
erro=0;
finalizar();

}
}

public static void saldo_atual(double saldo) {
System.out.println("\033\143");
System.out.println("Seu saldo atual é de: "+grana.format(saldo));
finalizar();
}

public static void finalizar(){
try{
System.out.println("(1) Menu inicial\t(2) Sair");
operacao=entrada.nextInt();
if(operacao == 1){
operacao=0;
main(null);

}else if(operacao == 2){
operacao=0;
sair();

} else{
System.out.println("\nOpção invalida! \n");
operacao=0;
finalizar();
}
}

catch(Exception e){
entrada.next();
finalizar();
}
}

public static void sair() {
System.out.println("\033\143");
System.out.println("Obrigado por utilizar nosso serviço! \n");
System.exit(0);
}
}