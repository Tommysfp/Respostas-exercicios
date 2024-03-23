
import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double paisB;
        double taxaB;
        double taxaA;
        double paisA;
        int anos = 0;
        String rodar;

        do{
        // Populaçao A
        do {
            System.out.println("Populaçao A:");
            paisA = entrada.nextDouble();
            if (paisA < 0)
                System.out.println("Numero deve ser maior que 0");
        } while (paisA < 0);

        // Populaçao B
        do {
            System.out.println("Populaçao B:");
            paisB = entrada.nextDouble();
            if (paisB < 0)
                System.out.println("Numero deve ser maior que 0");
        } while (paisB < 0);

        // Taxa A
        do {
            System.out.println("Taxa em Porcentagem A:");
            taxaA = entrada.nextDouble();
            if (taxaA > 100 || taxaA < 0)
                System.out.println("Porcentagem invalida, digite um numero entre 0 e 100");
            taxaA = taxaA / 100;

        } while (taxaA > 1 || taxaA < 0);

        // Taxa B

        do {
            System.out.println("Taxa em Porcentagem B:");
            taxaB = entrada.nextDouble();
            if (taxaB > 100 || taxaB < 0)
                System.out.println("Porcentagem invalida, digite um numero entre 0 e 100");
            taxaB = taxaB / 100;

        } while (taxaB > 1 || taxaB < 0);

        do {
            paisA *= (1 + taxaA);
            paisB *= (1 + taxaB);
            anos++;
        } while (paisA <= paisB);

        System.out.println("Levariam aproximadamente " + anos + " anos para atingirem a mesma populaçao! ");
        
        System.out.println("Gostaria de usar o programa outra vez? (Sim ou Nao)");
          rodar = entrada.next();
          if(rodar.equalsIgnoreCase("Nao"))
          System.out.println("Programa encerrado, Muito Obrigado!");
    }
    while (rodar.equalsIgnoreCase("Sim"));
        
    


    }
}
