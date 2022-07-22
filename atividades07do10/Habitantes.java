package atividades07do10;

import java.util.Scanner;
public class Habitantes {

    public static void main(String[] args){
         double A = 80.000;
         double B = 20.00;
         double Ano = 0 ;

    System.out.println("80.000 Habitantes:");
    Scanner scanner = new Scanner(System.in);
    A = scanner.nextDouble();
    System.out.println("20.000 Habitantes:");
    B = scanner.nextDouble();

   while(A <= B ) {
       System.out.println(A = A * 1.3);
       B = B * 1.15;
       Ano = 1;
   }

   System.out.println("A ultrapassa ou iguala B " + Ano );

}
}