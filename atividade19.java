import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros tem sua sequencia?");
        int quantidadeDeNumeros = entrada.nextInt();
        System.out.println("Digite os " + quantidadeDeNumeros + " numeros:");
        int sequencia;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        for (int i = 0; i < quantidadeDeNumeros; i++) {
           do{
            sequencia = entrada.nextInt();
            if (sequencia>1000)
            System.out.println("Numero deve ser menor que 1000");
            if(sequencia<0)
            System.out.println("Numero deve ser maior que 0");
        }
        while (sequencia>1000||sequencia<0);
        
            if (sequencia > maior) {
                maior = sequencia;
            }
            if (sequencia < menor) {
                menor = sequencia;
            }
            soma += sequencia;
        }
        System.out.println("O maior numero é: " + maior + " O menor numero é: " + menor
                + " E a soma dos numeros e igual a: " + soma);

        entrada.close();
    }
}
