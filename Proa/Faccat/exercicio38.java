package Faccat;

// Exercicio 38: Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
//diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
//mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
//esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
//senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.

import java.util.Scanner;

public class exercicio38 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Logar na conta");

        System.out.println("Digite seu código de usuário");

        int usuario= sc.nextInt();

        int usuarioRegistro= 1234;
        int senhaRegistro= 9999;

        if (usuario == usuarioRegistro){
            System.out.println("Digite sua senha");
            int senha= sc.nextInt();

            if (senha == senhaRegistro){
                System.out.println("Senha valida");
            } else {
                System.out.println("Senha invalida");
            }
        } else {
            System.out.println("Usuario invalido");
        }

        sc.close();
    }
}