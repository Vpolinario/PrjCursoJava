package atividades02do10;

import java.util.Scanner;
public class TudoCola {

    public static void main(String[] args){
         double lata;
         double Garrafa1;
         double Garrafa2;
         double litros;
         double total;
    System.out.println("Lata 350ml:");
    Scanner scanner = new Scanner(System.in);
    lata = scanner.nextDouble();

    System.out.println("Garrafa 600ml:");
    Garrafa1 = scanner.nextDouble();

    System.out.println("Garrafa 2Litros:");
    Garrafa2 = scanner.nextDouble();

    System.out.println("Informe quantos litros de refrigerante você comprou :");
    litros = scanner.nextDouble();

    total = Garrafa1 + Garrafa2 + litros ;
    System.out.println(total);
}
}