package atividades19do09;

import java.util.Scanner;

public class InteiroeReal {
    public static void main(String[] args){
    int NumeroReal;
    int NumeroInteiro;
    int Produto;
    int Produto2;
    int Produto3;
    int LicaoA;
    int LicaoB;
    int LicaoC;

    System.out.println("Informe dois números inteiros:");
    Scanner scanner = new Scanner(System.in);
    NumeroInteiro = scanner.nextInt();

    System.out.println("Informe um número inteiros:");
    NumeroReal = scanner.nextInt();

    System.out.println("Informe o primeiro número:");
    Produto = scanner.nextInt();

    System.out.println("Informe o segundo número:");
    Produto2 = scanner.nextInt();

    System.out.println("Informe o terceiro número:");
    Produto3 = scanner.nextInt();

    if (Produto <= NumeroInteiro){
        System.out.println("É um número inteiro");
    }
        else
            System.out.println("Não é inteiro:");
    if (Produto2 <= NumeroInteiro){
        System.out.println("É um número inteiro");
    }
        else
            System.out.println("Não é inteiro:");
    if (Produto3 <= NumeroReal){
        System.out.println("É um número real");
    }
        else
            System.out.println("Não é real:");

    LicaoA = Produto * 2 * Produto2 / 2;

    LicaoB = Produto^3 + Produto3;

    LicaoC = Produto3^3;



}
}