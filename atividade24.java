import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        double soma = 0;
        double somaI = 0;
        do {System.out.print("Digite a nota:");
            nota = entrada.nextInt();
            
            double i = 0;
            i++;
            soma += nota;
            somaI += i;
            System.out.println("Media: " + soma / somaI);
            
        } while (somaI!=0);
entrada.close();
    }
}
