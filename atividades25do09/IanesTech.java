package atividades25do09;



import java.util.Scanner;

public class IanesTech{
public static void main(String[] args){
double Salario;
double salarioReajustado = 0 ;
double valorAumento = 0;

	System.out.println("Favor informar o salário atual:");
	Scanner scanner = new Scanner(System.in);
	Salario = scanner.nextDouble();

	if(Salario <= 700){
		
		System.out.println("salarioReajustado" + Salario * 1.20);
		System.out.println( Salario +valorAumento);
		
		System.out.println("Salario anterior: " + Salario);
 	  	System.out.println("O percentual utilizado para o aumento do salário foi de: 20%");
 	   	System.out.println("O valor do aumento foi de: R$ " + valorAumento);
 	   	System.out.println("Salario atual: " + salarioReajustado);
 	   	
		}else if(Salario > 700 & Salario <= 1500){
		System.out.println(valorAumento <- Salario * 0);
		System.out.println(salarioReajustado <- Salario + valorAumento);
		
		System.out.println("Salario anterior: " + Salario);
		System.out.println("O percentual utilizado para o aumento do salário foi de: 15%");
		System.out.println("O valor do aumento foi de: R$ " + valorAumento);
		System.out.println("Salario atual"  + salarioReajustado);
		
		}else if(Salario > 1500 & Salario <= 25000){
			System.out.println(valorAumento <- Salario * 0.10);
			System.out.println(salarioReajustado <- Salario + valorAumento);
		
			System.out.println("Salario anterior: " + Salario);
			System.out.println("O percentual utilizado para o aumento do salário foi de: 10%");
			System.out.println("O valor do aumento foi de: R$ " + valorAumento);
			System.out.println("Salario atual: " + salarioReajustado);
		    
			}else{
			System.out.println(valorAumento <- Salario * 0);
			System.out.println(salarioReajustado <- Salario + valorAumento);
		    }
	}
}