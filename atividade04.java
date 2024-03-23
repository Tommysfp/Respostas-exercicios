
public class atividade04 {
    public static void main (String[] args){
double paisA = 80000;
double paisB = 200000;
double taxaB = 0.015;
double taxaA = 0.03;
int anos = 0;
do {
    paisA *= (1 + taxaA);
    paisB *= (1 + taxaB);
     anos++;
}while (paisA < paisB);

 System.out.println("Levariam aproximadamente "+anos+" anos para atingirem a mesma populaçao! ");

}
}
