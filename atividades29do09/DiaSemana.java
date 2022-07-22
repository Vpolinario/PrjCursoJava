package atividades29do09;


import java.util.Scanner;
public class DiaSemana {

public static void main(String[] args){

 int num;

 
 
 Scanner entrada = new Scanner(System.in);
 
 System.out.print("Digite UM numero: ");
 num = entrada.nextInt();
 
 if (num == 1)
     System.out.println("Segunda feira");
 if (num == 2)
     System.out.println("Terça feira");
 if (num == 3)
     System.out.println("Quarta feira");
 if (num == 4)
     System.out.println("Quinta feira");
 if (num == 5)
     System.out.println("Sexta feira");
 if (num == 6)
     System.out.println("Sabado feira");
 if (num ==7)
     System.out.println("Domingo feira");
 if (num>7 || num<1)
     System.out.println("NUMERO INVALIDO");
}
}