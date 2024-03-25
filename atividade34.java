import java.util.Scanner;
public class atividade34 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    double numero = entrada.nextDouble();
    double tentativa;
    int loop=0;
    for(int i=2;i<numero;i++){
    tentativa = numero/i;
    if (tentativa%1 == 0){loop++;}
    
}
if (loop >= 1){
    System.out.println("Numero NAO e primo.");  
}
    else
     System.out.println("Numero E primo.");

entrada.close();

    }
    
}
