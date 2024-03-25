import java.util.Scanner;
public class atividade25 {
    public static void main(String[] args){
 Scanner entrada = new Scanner(System.in);
 int numeroDePessoas;
 int idade = 0;
 int soma=0;
 System.out.print("Quantidade de pessoas: ");
 numeroDePessoas=entrada.nextInt();
 for(int i=0;i<numeroDePessoas;i++){
    System.out.print("idade: ");
    idade=entrada.nextInt();
    soma += idade;
 }
 int media = soma/numeroDePessoas;
 System.out.print("Media: "+media);
 if (media>0 && media<=25)
 System.out.println("\nA turma e jovem.");
 if (media>25 && media<60)
 System.out.println("\nA turma e adulta");
 if (media>60)
 System.out.println("\nA turma e idosa");
entrada.close();

    }
    
}
