import java.util.Scanner;
public class atividade18 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
System.out.println("Quantos numeros tem sua sequencia?");
int numeros = entrada.nextInt();
System.out.println("Digite os "+numeros+" numeros:");
int sequencia;
int maior = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;
int soma = 0;
for (int i=0 ; i < numeros;i++){
    sequencia = entrada.nextInt();
    if(sequencia>maior){maior=sequencia;}
    if(sequencia<menor){menor=sequencia;}
    soma += sequencia;
}
System.out.println("O maior numero é: "+maior+" O menor numero é: "+menor+" E a soma dos numeros e igual a: "+soma  );



    }
}
