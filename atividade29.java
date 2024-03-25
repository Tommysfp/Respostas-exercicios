import java.util.Scanner;
public class atividade29 {
public static void main(String[]args){
Scanner entrada = new Scanner(System.in);
double soma = 0;
for(int i=1;i<=50;i++){
    soma+=1.99;
    System.out.printf("\n"+i+" = R$ %.2f",soma);
}

entrada.close();

}
    
}
