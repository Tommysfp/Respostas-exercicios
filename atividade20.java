import java.util.Scanner;

public class atividade20 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    String repetir;
    do{
        System.out.print("Digite o numero que deseja caucular o fatorial: ");    
    int numero; 
    do{
        numero = entrada.nextInt();
    if(numero<0||numero>16)
    System.out.println("Seu numero deve ser POSITIVO e MENOR que 16\nDigite Novamente:");
    }while(numero<0 || numero>16);

        double resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.println("Fatorial de " + numero + " e: " + resultado);
        System.out.println("Voce deseja rodar o programa mais uma vez?(Sim ou Nao?)");
        repetir=entrada.next();
        if (repetir.equalsIgnoreCase("Nao"))
        System.out.println("Programa finalizado com sucesso!");
    }while(repetir.equalsIgnoreCase("Sim"));

        entrada.close();
    }
}