import java.util.Scanner;
public class atividade11 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
System.out.println("Numero 1");
int numero1 = entrada.nextInt();
System.out.println("Numero 2");
int numero2 = entrada.nextInt();
int soma = 0;
for(int i=numero1+1;i<numero2;i++){
    System.out.println(i);
soma += i;

   
  }
  System.out.println("A soma dos numeros entre "+numero1+" e "+numero2+" é: "+soma);
  entrada.close();
 }
}
