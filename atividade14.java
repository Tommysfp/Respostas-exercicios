import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosImpares = 0;
        int numerosPares = 0;
        int numero;
        System.out.println("Digite 10 numeros");
        for (int i=0;i<10;i++){
        numero = entrada.nextInt();
        if(numero %2==0)
        numerosPares++;
        else 
        numerosImpares++;
        }
        System.out.println(numerosPares+" Numeros Pares "+numerosImpares+" Numeros impares");
   
        entrada.close();

    }
}