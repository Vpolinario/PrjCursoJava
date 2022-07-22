package aitividades18do09;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args){
           double lado;
           double area;
           double lado2;
           double dobro = 2;
           
           System.out.println("digite a area:");
           Scanner scanner = new Scanner(System.in);
           lado = scanner.nextDouble();

           area = lado  * lado * dobro; 
           System.out.println("= o dobro da area e = "+ area);

         }
}

