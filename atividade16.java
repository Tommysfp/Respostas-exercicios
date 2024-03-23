import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiroTermo = 1;
        int segundoTermo = 1;
        int proximoTermo = 3;
        
      
        do {

            proximoTermo = segundoTermo + primeiroTermo;
            System.out.println(proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
       
        }
        while (proximoTermo<500);
        
        entrada.close();
    }

}