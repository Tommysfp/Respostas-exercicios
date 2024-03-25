import java.util.Scanner;
public class atividade27 {
    public static void main(String[] args){
    Scanner entrada=new Scanner(System.in);
System.out.print("Numero de turmas:");
    int quantidadeDeTurmas=entrada.nextInt();
    for(int i=0;i<quantidadeDeTurmas;i++){
        System.out.print("Quantidade de alunos na "+(i+1)+"º turma:");
        
    }

entrada.close();


    }
    
}
