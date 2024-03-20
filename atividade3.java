import java.util.Scanner;
public class atividade3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

 String nome;
 String sexo;
 String estadoCivil;
 int idade;
 double salario;

 //Nome
 System.out.println("Nome:");
 do{
nome = entrada.nextLine();
if (nome.length() <= 3){
System.out.println("Nome deve conter 3 ou mais caracteres \n Nome:");
 }
}
while (nome.length() <= 3);

//Idade
System.out.println("Idade:");
do{
    idade = entrada.nextInt();
    if(idade>150 || idade<0)
    System.out.println("idade invalida!\n Idade:");
}
while (idade>150 || idade<0);

//Salario
System.out.println("Salario: ");
do{
salario = entrada.nextDouble();
if(salario<=0)
System.out.println("Salario deve ser maior que 0");;
}
while (salario<=0);

//Sexo
System.out.println("Sexo: ");
do{
    sexo = entrada.next();
    if (!sexo.equalsIgnoreCase("F") & !sexo.equalsIgnoreCase("M")){
    System.out.println("Invalido, digite F para Feminino e M para Masculino");
    }
}
while (!sexo.equalsIgnoreCase("F") & !sexo.equalsIgnoreCase("M"));


//Estado civil
System.out.println("Estado Civil:");
do{
    estadoCivil = entrada.next();
    if (!estadoCivil.equalsIgnoreCase("V") & !estadoCivil.equalsIgnoreCase("C")& !estadoCivil.equalsIgnoreCase("S")& !estadoCivil.equalsIgnoreCase("D")){
    System.out.println("Invalido, Digite (V - viuvo) (C - casado) (D - divorciado) ou (S - solteiro)");
    }
}


while (!estadoCivil.equalsIgnoreCase("V") & !estadoCivil.equalsIgnoreCase("C") & !estadoCivil.equalsIgnoreCase("S") & !estadoCivil.equalsIgnoreCase("D"));




System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo.toUpperCase()+"\nSalario: "+salario+"\nEstado Civil: "+ estadoCivil.toUpperCase());



    }
}
