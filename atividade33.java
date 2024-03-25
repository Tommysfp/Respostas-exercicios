import java.util.Scanner;

public class atividade33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade de temperaturas: ");
        int numeros = entrada.nextInt();
        System.out.println("Digite as " + numeros + " temperaturas:");
        int sequencia;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        for (int i = 0; i < numeros; i++) {
            sequencia = entrada.nextInt();
            if (sequencia > maior) {
                maior = sequencia;
            }
            if (sequencia < menor) {
                menor = sequencia;
            }
            soma += sequencia;
        }
        System.out.println("A maior temperatura foi de: " + maior + "° O menor Temperatura foi de: " + menor+"°"
                + " A temperatura Media foi de: " + soma/numeros+"°");

        entrada.close();
    }
}