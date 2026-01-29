import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class exercicio1 {
public static void main (String[] args) throws FileNotFoundException, IOException {

Scanner entrada0 = new Scanner (System.in, "CP850");
Scanner entrada1 = new Scanner (System.in);
ArrayList <String> RA = new ArrayList <String>();
ArrayList <String> NOME = new ArrayList <String>();
ArrayList <String> NOTA = new ArrayList <String>();

double turma = 0.0, media = 0.0, maiormedia = 0.0, menormedia = 10.0, n1, n2, n3;
String NOME3 = "", NOTA3 = "", RA3 = "", texto;
int continua = 0, op = 0;

if (new File ("cadastro.txt").exists()) {
try {

BufferedReader br = new BufferedReader (new FileReader ("cadastro.txt"));
if (br.readLine() != null) {

FileInputStream filer = new FileInputStream ("cadastro.txt");
DataInputStream FileReader = new DataInputStream (filer);

RA3 = FileReader.readUTF();
NOME3 = FileReader.readUTF();
NOTA3 = FileReader.readUTF();
FileReader.close();
String NOME2[] = NOME3.split (";");
String NOTA2[] = NOTA3.split (";");
String RA2[] = RA3.split (";");

for (int i = 0; i < NOTA2.length;i++) {

RA.add (RA2[i]);
NOME.add (NOME2[i]);
NOTA.add (NOTA2[i]);
}
}

br.close();

}
catch (IOException e) {
e.printStackTrace();
}

} else {}

System.out.printf ("1- Cadastro dos alunos \n");
System.out.printf ("2- Listar dos alunos \n");
System.out.printf ("3- Dados Gerais \n");

try {
continua = entrada1.nextInt();
}

catch (Exception e) {
entrada0.next();
}

if (continua == 1) {
do {
do {
op = 0;

System.out.printf ("Cadastro \n\n");
System.out.printf ("Digite o RA: \n");

texto = entrada0.nextLine();
if (texto.length() > 0 && texto.length() <= 4) {
RA.add (texto);
op = 1;
}

} while (op != 1 || texto.length() == 0);
do {

System.out.printf ("Digite o nome do aluno: \n");
texto = entrada0.nextLine();
if (texto.length() > 30) {
System.out.printf ("O nome excede o tamanho permitido (30).\n");
} else {
NOME.add (texto);
}

} while (texto.length() > 30);
do {

System.out.printf ("Digite a primeira nota: \n");
n1 = entrada0.nextDouble();
if (n1 < 0 || n1 > 10) {
System.out.printf ("A nota deve ser menor que 10! \n");
}

} while (n1 < 0 || n1 > 10);
do {

System.out.printf ("Digite a primeira nota: \n");
n2 = entrada0.nextDouble();
if (n2 < 0 || n2 > 10) {
System.out.printf ("A nota deve ser menor que 10! \n");
}

} while (n2 < 0 || n2 > 10);
do {

System.out.printf ("Digite a primeira nota: \n");
n3 = entrada0.nextDouble();
if (n3 < 0 || n3 > 10) {
System.out.printf ("A nota deve ser menor que 10! \n");
}

} while (n3 < 0 || n3 > 10);
media = (n1 + n2 + n3)/3;

NOTA.add (Double.toString (media));
System.out.printf ("Deseja inserir outro cadastro? s/n\n");
op = entrada0.next().charAt (0); RA3 = String.join (";", RA);
NOME3 = String.join (";", NOME);
String[] NOTA4 = new String[NOTA.size()];

for (int i = 0; i < NOTA.size(); i++) {
NOTA4[i] = NOTA.get (i).toString();
}

NOTA3 = String.join (";", NOTA4);
FileOutputStream filew = new FileOutputStream ("cadastro.txt");
DataOutputStream FileWriter = new DataOutputStream (filew);

FileWriter.writeUTF (RA3);
FileWriter.writeUTF (NOME3);
FileWriter.writeUTF (NOTA3);
FileWriter.close();

} while (op == 's' || op == 'S');
main (null);

} else if (continua == 2) {
System.out.printf ("Alunos Cadastrados: \n");
if (continua == 2) {
for (int i = 0; i < NOTA.size(); i++) {
System.out.print ("Ra: " + RA.get (i) + " Nome: " + NOME.get (i) + " Média: " + Double.valueOf (NOTA.get (i)));
if (Double.valueOf (NOTA.get (i)) >= 8.5) {
System.out.print (" - Excelente \n");

} else if (Double.valueOf (NOTA.get (i)) < 8.5 || Double.valueOf (NOTA.get (i)) >= 7) {
System.out.print (" - Boa \n");
} else if (Double.valueOf (NOTA.get (i)) < 7 || Double.valueOf (NOTA.get (i)) >= 5) {
System.out.print (" - Regular \n");
} else {
System.out.print (" - Preocupante \n");
}
}
}

do {
System.out.printf ("1- Voltar \n2- Sair \n");
continua = entrada1.nextInt();
if (continua == 1) {
main (null);

} else if (continua == 2) {
System.exit (0);
} else {
System.out.printf ("Opção inválida! \n");

}
} while (continua != 1 && continua != 2);
} else if (continua == 3) {
for (int i = 0; i < NOTA.size(); i++) {

turma = turma + Double.valueOf (NOTA.get (i));
if (Double.valueOf (NOTA.get (i)) < menormedia) {
menormedia = Double.valueOf (NOTA.get (i));
}

if (Double.valueOf (NOTA.get (i)) > maiormedia) {
maiormedia = Double.valueOf (NOTA.get (i));
}
}

turma = turma/NOTA.size();

System.out.printf ("Média geral da turma: " + turma+ "\n");
System.out.printf ("Menor nota média: " + menormedia+ "\n");
System.out.printf ("Maior nota média: " + maiormedia+ "\n");
System.out.printf ("Alunos cadastrados: " + RA.size()+ "\n");

do {
System.out.printf ("1- Voltar \n2- Sair \n");
continua = entrada1.nextInt();
if (continua == 1) {
main (null);
} else if (continua == 2) {
System.exit (0);
} else {
System.out.printf ("Opção inválida! \n");
}
} while (continua != 1 && continua != 2);
} else {}
entrada0.close();
entrada1.close();
}
} 