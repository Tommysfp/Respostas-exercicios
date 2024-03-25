import java.util.Scanner;
public class atividade37 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int altura;
        int peso;
        int codigo;
        int alturaMemoriaMaior = Integer.MIN_VALUE;
        int alturaMemoriaMenor = Integer.MAX_VALUE;;
        int pesoMemoriaMaior = Integer.MIN_VALUE;
        int pesoMemoriaMenor = Integer.MAX_VALUE;
        int codPesoMenor = 0;
        int codPesoMaior= 0;
        int codAlturaMenor = 0;
        int codAlturaMaior = 0;


        do {
            System.out.print("Digite o codigo: ");
            codigo = entrada.nextInt();
            if(codigo!=0){
            System.out.print("Digite seu peso(Kg): ");
            peso = entrada.nextInt();
            System.out.print("Digite sua altura(Cm): ");
            altura = entrada.nextInt();
            System.out.print("\n");

if(peso>pesoMemoriaMaior){
pesoMemoriaMaior=peso;
codPesoMaior=codigo;
}
if(peso<pesoMemoriaMenor){
pesoMemoriaMenor=peso;
codPesoMenor=codigo;
}
if(altura>alturaMemoriaMaior){
    alturaMemoriaMaior=altura;
    codAlturaMaior=codigo;
}
if(altura<alturaMemoriaMenor){
alturaMemoriaMenor=altura;
codAlturaMenor=codigo;}
} }while (codigo!=0);

System.out.println("Maior peso foi Cod: "+codPesoMaior+" Peso: "+pesoMemoriaMaior+"Kg");
System.out.println("Menor peso foi Cod: "+codPesoMenor+" Peso: "+pesoMemoriaMenor+"Kg");
System.out.println("Mais alto foi cod: "+codAlturaMaior+" Altura: "+alturaMemoriaMaior+"cm");
System.out.println("Mais baixo foi cod: "+codAlturaMenor+" Altura: "+alturaMemoriaMenor+"cm");



    }
    
}
