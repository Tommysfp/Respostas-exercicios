import java.util.Scanner;
public class atividade17 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     System.out.print("Digite o numero que deseja caucular o fatorial: ");
    int numero=entrada.nextInt();
    double resultado=1;
for (int i=1;i<=numero;i++){
    resultado*=i;

}
  System.out.println("Fatorial de "+numero+" e: "+resultado);
     

    entrada.close();
}
}