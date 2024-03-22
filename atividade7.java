import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);

     int maior = Integer.MIN_VALUE;

for (int i = 0; i <5;i++){
    System.out.println("Digite o "+ (i+1) +"º numero:");
    int numero = entrada.nextInt();
    if(numero>maior){
        maior = numero;
    }}

System.out.println("O maior Numero e " +maior);

entrada.close();
    }
}
