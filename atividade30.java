import java.util.Scanner;
public class atividade30 {
public static void main(String[]args){
Scanner entrada = new Scanner(System.in);
double soma = 0;
System.out.print("Valor do pao: R$ ");
double valorDoPao = entrada.nextDouble();
for(int i=1;i<=50;i++){
    soma+=valorDoPao;
    System.out.printf("\n"+i+" = R$ %.2f",soma);
}

entrada.close();

}
    
}
