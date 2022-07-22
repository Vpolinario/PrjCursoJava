package atividades24do09;


		import java.util.Scanner; 

		public class VogalouConsoante { 
		  public static void main(String []args){ 


		   System.out.println("introduza a letra:"); 
		   Scanner read = new Scanner(System.in); 

		   String N=read.next();
		   char c=N.charAt(0);
		   //N=read.nextLine(); 

		   System.out.println(N);

		    switch(c){ 

		   case'a': 
		   case'e': 
		   case'i': 
		   case'o': 
		   case'u': 

		      System.out.println("a letra "+N+" é uma vogal"); 
		      break; 
		     default: 
		      System.out.println("a letra "+N+" é uma consoante"); 
		     } 

		 } 
		}