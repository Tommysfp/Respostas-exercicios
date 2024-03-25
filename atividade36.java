import java.util.Scanner;

public class atividade36 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int numero;
        int tabuada;
        int i;
        int comeco;
        int fim;
        System.out.print("Montar a tabuada de: ");
        numero = entrada.nextInt();
        System.out.print("Começar por: ");
        comeco = entrada.nextInt();
        System.out.print("Terminar em: ");
        fim = entrada.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        entrada.close();
        for (i = comeco; i <= fim; i++) {
            tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
      
    }

}