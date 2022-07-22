package atividades14do10;

import java.util.Scanner;
public class QtdNotas {
                public static void main(String[] args){

            int nota;
            double soma = 0;
            double  media; 
            int qtdNota = 4;

            Scanner scanner = new Scanner(System.in);
            for(int i = 1; i<= qtdNota ;i++){
                System.out.println("digite o numero"+ i +":");
                nota = scanner.nextInt();
                soma += nota;
            }
            media = soma/qtdNota;

            System.out.println("= Média = "+ media);

        }
    }