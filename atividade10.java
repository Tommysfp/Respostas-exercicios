import java.util.Scanner;
public class atividade10 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
System.out.println("Numero 1");
int numero1 = entrada.nextInt();
System.out.println("Numero 2");
int numero2 = entrada.nextInt();

for(int i=numero1+1;i<numero2;i++){
    System.out.println(i);
    entrada.close();
  }
 }
}
