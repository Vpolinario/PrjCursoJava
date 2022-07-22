package atividades03do10;


import java.util.Scanner;

public class De0a10 {

    public static void main(String[] args) {
        double n1;

        System.out.println("Digite uma nota entre 0 e 10: ");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextDouble();

        if (n1 >= 10) {
            System.out.println("Numero Invalido");
            n1 = n1 ++;

        }

    }

}