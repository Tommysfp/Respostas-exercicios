import java.util.Scanner;

public class atividade23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double i = 2;
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        for (int n = 1; n < numero; n++) {
            double tentativa;
            int loop = 0;
            for (i = 2;i < n; i++) {
                tentativa = n / i;
                if (tentativa % 1 == 0) {
                    loop++;
                }
            }
            if (loop >= 1) {
            } else
                System.out.println("Numero " + n + " E primo.");

        }
        System.out.println("Programa executou " + (i + 2) + " Divisoes");
        entrada.close();

    }

}
