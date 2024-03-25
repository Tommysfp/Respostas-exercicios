import java.util.Scanner;
public class atividade26 {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Qual sera o numero de Eleitores?");
int numeroDeEleitores=entrada.nextInt();
int candidato1=0;
int candidato2=0;
int candidato3=0;
for (int i=0;i<numeroDeEleitores;i++){
    System.out.print("Digite seu voto (1,2 ou 3) eleitor "+(i+1)+":");
    String voto=entrada.next();
    if(voto.equals("1"))
    candidato1++;
    if(voto.equals("2"))
    candidato2++;
    if(voto.equals("3"))
    candidato3++;
}
System.out.println("Candidato 1 teve "+candidato1+" votos");
System.out.println("Candidato 2 teve "+candidato2+" votos");
System.out.println("Candidato 3 teve "+candidato3+" votos");
entrada.close();

    }
    
}
