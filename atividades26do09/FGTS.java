package atividades26do09;



import java.util.Scanner;

	public class FGTS {
    public static void main(String[] args){
    double valorHora;
    double salarioBruto ;
    double salarioLiquido;
    double IR;
    double INSS;
    double sindicato;
    double FGTS;
    double descontos;
    double qtdHoras;
    double descriçaoIR;
    
    
    	System.out.println("Favor informar o valor da hora trabalhada:");
    	Scanner scanner = new Scanner(System.in);
    	valorHora = scanner.nextDouble();

    	System.out.println("Favor informar a quantidade de horas trabalhadas:");
    	qtdHoras = scanner.nextDouble();
    	double qtdHora;
    	
    	
    	salarioBruto = valorHora * qtdHoras;
     	INSS = salarioBruto * 0.10;
    	sindicato = salarioBruto * 0.03;
    	FGTS = salarioBruto * 0.11;
    	
    	if (salarioBruto <= 900){
    	System.out.println(IR = 0.05);
    	System.out.println("isento");
    	descontos =  IR + INSS + sindicato;
    	salarioLiquido =  salarioBruto - descontos;
    	}else {
    	if(salarioBruto <= 1500) {
    	IR = salarioBruto * 0.05;
    	descriçaoIR = 0.05; 
    	descontos = IR + INSS + sindicato;
    	salarioLiquido = salarioBruto - descontos;
    	}else {
    	 if(salarioBruto <= 2500) {
           IR = salarioBruto * 0.10;
           descriçaoIR = 0.10;
           descontos = IR + INSS + sindicato;
           salarioLiquido = salarioBruto - descontos;
           }else {
        	  IR = salarioBruto * 0.20;
        	  descriçaoIR = 0.20;
        	  descontos = IR + INSS + sindicato;
        	  salarioLiquido = salarioBruto - descontos;
           			}
    			}
    	    }
    	}
	}