import java.util.Scanner; 

 public class atividade01 { 

   public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);
        
        int nota;
        System.out.println("digite um valor de 0 a 10: ");
        do {
          
           nota = entrada.nextInt();
           if (nota <=10 && nota >=0)
           {
            System.out.println("Muito Bem! \n voce digitou a nota: "+ nota);}
            else{
             System.out.println("Nota invalida, Digite um numero entre 0 e 10: ");
            }
           
        } while (nota >10 || nota <0);
        
        entrada.close();
    }
}
  
