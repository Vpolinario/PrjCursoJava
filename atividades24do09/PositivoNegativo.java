package atividades24do09;

import java.util.Scanner;

public class PositivoNegativo {
    private static double primeiro, segundo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean parar = false;
        char letra;

        do{
            System.out.print("Digite um n�mero inteiro: ");
            numero = entrada.nextInt();


            if(numero%2==0){
                System.out.print("O n�mero � par.\n");
            }else{
                System.out.print("O n�mero n�o � par\n");
            }
            if(numero<0){
                System.out.print("O n�mero � negativo\n");
            }else{
                System.out.print("O n�mero � positivo\n");
            }

            System.out.println("Deseja sair? (s/N)? ");
            letra = entrada.next().charAt(0);
            if(letra == 's' || letra == 'S'){
                parar = true;
            }

        }while(parar==false);

    }
}