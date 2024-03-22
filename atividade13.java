import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base;
        int expo;
        int a = 1;
        base = entrada.nextInt();
        expo = entrada.nextInt();
        for (int i = 1; i <= expo; i++) {
             a *= base;
           
        }
        System.out.println(a);
        entrada.close();

    }
}