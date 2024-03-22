import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int soma = 0;

for (int i=0; i<5 ;i++){
System.out.println("Digite o valor do "+ (i+1) + "º numero: ");
int numero = entrada.nextInt();
soma += numero;

}
double media = soma/5;
System.out.println("Soma:"+ soma);
System.err.println("Media:"+media);

    }
}
