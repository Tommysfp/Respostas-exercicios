import java.util.Scanner;
public class atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
int numero;
int tabuada;
int i;
    System.out.println("Digite seu numero: ");
     numero = entrada.nextInt(); 
     entrada.close();
     System.out.println("Tabuada de "+numero+":"); 
for(i=1;i<=10;i++){
tabuada = numero*i;
System.out.println(numero+" x "+i+" = "+tabuada);
}

    }
}
