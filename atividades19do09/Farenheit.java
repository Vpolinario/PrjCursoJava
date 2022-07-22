package atividades19do09;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args){
    int Farenheit;
    int GrausCelsius;



    System.out.println("digite temperatura em graus Farenheit:");
    Scanner scanner = new Scanner(System.in);
    Farenheit = scanner.nextInt();

    System.out.println("digite graus Celsius. :");
    GrausCelsius = scanner.nextInt();

    GrausCelsius = (5 * (Farenheit-32) / 9);

            System.out.println("= GrausCelsius  = "+ GrausCelsius);

}
}