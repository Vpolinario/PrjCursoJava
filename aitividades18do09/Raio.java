package aitividades18do09;

import java.util.Scanner;

public class Raio {
    public static void main(String[] args){
           double raio;
           double area;
           double pi = 3.14;

           System.out.println("digite o raio:");
           Scanner scanner = new Scanner(System.in);
           raio = scanner.nextDouble();

           area = pi  * (raio * raio);
           System.out.println("= area = "+ area);

         }
}