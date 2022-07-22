package atividades23do09;

import java.util.Scanner;

public class INSS {
    public static void main(String[] args) {
            double qtdHoras;
            double valorHora;
            double salarioBruto;
            double ir = 0.11;
            double INSS = 0.8;
            double sind = 0.5;
            double totalDeDescontos;
            double salarioLiquido;


                    System.out.println("Informe quanto voce ganha por hora:");
                    Scanner scanner = new Scanner(System.in);
                    qtdHoras = scanner.nextDouble();



                    System.out.println("Informe quantas horas voce trabalha no mes: ");
                    valorHora = scanner.nextDouble();
                    System.out.println(" ");

                    System.out.println("Informe seu Salario Bruto: ");
                    salarioBruto = scanner.nextDouble();
                    System.out.println(" ");

                    System.out.println("Informe quanto pagou de imposto de renda.: ");
                    ir = scanner.nextDouble();
                    System.out.println(" ");

                    System.out.println("Informe Quanto pagou ao sindicato.: ");
                    sind = scanner.nextDouble();
                    System.out.println(" ");

                    System.out.println("Total de descontos: ");
                    totalDeDescontos = scanner.nextDouble();
                    System.out.println(" ");

                    System.out.println("O salário líquido.: ");
                    salarioLiquido = scanner.nextDouble();
                    System.out.println(" ");

                    totalDeDescontos = salarioBruto / 0.11; 


                    System.out.println(" ");


    }

}