import java.util.Scanner;

public class atividade28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media;
        double valor = 0;
        System.out.print("Quantidade de CDs: ");
        int totalCds = entrada.nextInt();
        for (int i = 1; i <= totalCds; i++) {
            System.out.print("Valor do " + i + "º CD ");
            valor += entrada.nextDouble();
        }media = valor / totalCds;
         System.out.printf("O valor total gasto em CDs foi de R$ %.2f" , valor);
                System.out.printf( "\nA media gasta por CD foi de R$ %.2f" , media);

        entrada.close();

    }
}
