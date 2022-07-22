package aitividades18do09;

import java.util.Scanner; 

public class Salariomes { 
	public static void main (String[] args) {
		int HorasTrabalho; 
		int Horas;
		int Salario;
		
		System.out.println("digite horas trabalhadas: ");
		Scanner scanner = new Scanner(System.in);
		HorasTrabalho = scanner.nextInt();
		
		 System.out.println("digite horas :");
         Horas = scanner.nextInt();

         Salario = Horas * HorasTrabalho ;
         System.out.println("= salario = "+ Salario);
		
	}
}

	