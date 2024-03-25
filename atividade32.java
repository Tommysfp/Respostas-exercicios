import java.util.Scanner;

public class atividade32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Fatotial de :");
        int numero = entrada.nextInt();
        int fat = 1;
        System.out.println("Fatorial de: " + numero);
        System.out.print(numero + "! = ");

        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i != 1)
                System.out.print(" . ");
            else
                System.out.print(" = ");

            fat *= i;

        }
        System.out.println(fat);

        entrada.close();
    }

}
