package atividades19do09;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        double Farenheit;
        double GrausCelsius;



    System.out.println("digite temperatura em graus Farenheit:");
    Scanner scanner = new Scanner(System.in);
    Farenheit = scanner.nextDouble();

            GrausCelsius  = (Farenheit-32) * 5/9 ;

            System.out.println("= GrausCelsius = "+ GrausCelsius);

}
}