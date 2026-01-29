import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        
        int idade;
        int contagem = 0;
    
        for ( int i = 1; i <= 10; i++) {
 
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa: "));
        
            if (idade >= 18) {
                contagem = contagem + 1;
            }
        }
 
        System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é de: " +contagem+ " pessoas");

    }
 
}
    

