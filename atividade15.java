import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroTermo = 1;
        int segundoTermo = 1;
        int proximoTermo = 3;
        
        System.out.println("Escreva o numero da sequencia");
        int numeroDaSequencia = entrada.nextInt();
        for (int i = 3; i <= numeroDaSequencia; i++) {

            proximoTermo = segundoTermo + primeiroTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;

        }
        System.out.println(proximoTermo);
        entrada.close();
    }

}