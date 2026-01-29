import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        
        int i, matricula, aprovado = 0, reprovado = 0;
        double n1, n2, n3, media, aulas, assistidas, frequencia, ac = 0.0, maior = 0.0, menor = 0.0, nm = 0.0;
        String codigo;

        for(i=1; i < 11; i++) {
            System.out.println("\nAluno: " +i+ ":\n");
            System.out.println("Digite o número da matricula: ");
            matricula = entrada.nextInt();
            System.out.println("Digite a primeira nota: ");
            n1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota: ");
            n2 = entrada.nextDouble();
            System.out.println("Digite a terceira nota: ");
            n3 = entrada.nextDouble();
            System.out.println("Digite o total de aulas: ");
            aulas = entrada.nextInt();
            System.out.println("Quantas aulas o aluno participou: ");
            assistidas = entrada.nextInt();

            media = (n1+n2+n3) /3;
            frequencia = (assistidas / aulas) * 100;
            nm = nm + media;

            if(media >= 6.0 && frequencia >= 0.75) {
            codigo = "Aprovado";
            aprovado = aprovado + 1;
            } else {
                codigo = "Reprovado";
                reprovado = reprovado + 1;
            }
            System.out.println("Matricula: " +matricula);
            System.out.println("Frequência: " +frequencia);
            System.out.println("Nota Final: " +media);
            System.out.println("Status: " +codigo);

            if (i == 0){
            ac = media;
            } else {
            if (media > ac){
            maior = media;
            menor = ac;
            } else {
            menor = media;
            ac = menor;
            }
        }
            System.out.println("\n");
            System.out.println("A maior média da turma é: " +maior);
            System.out.println("A menor média da turma é: " +menor);
            System.out.println("A média da turma é: " + nm / (i+1));
            System.out.println("A quantidade de alunos aprovados é: " +aprovado);
            System.out.println("A quantidade de alunos reprovados é: " +reprovado);
            }
          }
        }
    


