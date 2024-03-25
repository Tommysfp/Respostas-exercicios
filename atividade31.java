import java.util.Scanner;

public class atividade31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        double dinheiro;
        double soma = 0;
        int i = 0;
        String repetir;
        do {
            do {
                i++;
                System.out.print("Valor do prduto " + i + ": R$ ");
                valor = entrada.nextDouble();
                soma += valor;
            } while (valor != 0);
               System.out.println("total: " + soma);
               System.out.print("Valor recebido: ");
               i = i-i;
            do {
                dinheiro = entrada.nextDouble();
                if (dinheiro < soma)
                    System.out.print("O valor recebido deve ser maior que o total\nValor recebido: R$");
            } while (dinheiro < soma);
            System.out.println("Troco = R$ " + (dinheiro - soma));
            System.out.print("Deseja começar outra compra?(Sim ou Nao): ");
            repetir = entrada.next();
            if (repetir.equalsIgnoreCase("sim")) {
            } else
                System.out.println("Programa finalizado");
        } while (repetir.equalsIgnoreCase("Sim"));
        entrada.close();
    }
}
