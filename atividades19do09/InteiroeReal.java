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

    System.out.println("Informe dois n�meros inteiros:");
    Scanner scanner = new Scanner(System.in);
    NumeroInteiro = scanner.nextInt();

    System.out.println("Informe um n�mero inteiros:");
    NumeroReal = scanner.nextInt();

    System.out.println("Informe o primeiro n�mero:");
    Produto = scanner.nextInt();

    System.out.println("Informe o segundo n�mero:");
    Produto2 = scanner.nextInt();

    System.out.println("Informe o terceiro n�mero:");
    Produto3 = scanner.nextInt();

    if (Produto <= NumeroInteiro){
        System.out.println("� um n�mero inteiro");
    }
        else
            System.out.println("N�o � inteiro:");
    if (Produto2 <= NumeroInteiro){
        System.out.println("� um n�mero inteiro");
    }
        else
            System.out.println("N�o � inteiro:");
    if (Produto3 <= NumeroReal){
        System.out.println("� um n�mero real");
    }
        else
            System.out.println("N�o � real:");

    LicaoA = Produto * 2 * Produto2 / 2;

    LicaoB = Produto^3 + Produto3;

    LicaoC = Produto3^3;



}
}