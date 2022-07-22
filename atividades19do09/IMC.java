package atividades19do09;


	import java.util.Scanner;

	 public class IMC {

	    public static void main(String[] args){
	        double altura;
	        double massa;
	        double imc;


	    System.out.println("digite sua altura :");
	    Scanner scanner = new Scanner(System.in);
	    altura = scanner.nextDouble();
	    
	    System.out.println("digite sua massa :");
	    massa = scanner.nextDouble();
	    
     
     imc = massa / altura * altura / 2.56; 
    		 
	            System.out.println("= imc  = "+ imc);

	}
	}