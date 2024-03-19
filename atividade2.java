import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String usuario;
    String senha;
    
    System.out.println("Usuario: ");
    do {
        usuario = entrada.nextLine();
        System.out.println("Senha:");
        senha = entrada.nextLine();
        if (usuario.equalsIgnoreCase(senha)) {
         System.out.println("Usuario e senha nao podem ser iguais, tente novamente:\n Usuario: ");}
         else {
            System.out.println("Muito bem!");
        }

    }
    while (usuario.equalsIgnoreCase(senha));


    
    
    
    
    entrada.close();
 }   
}
