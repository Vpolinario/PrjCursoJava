package atividades25do09;

import java.util.Scanner;

public class Turno{

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        char opcao;

        System.out.println("Em qual turno voce estuda/ (m = matutino, v = vespertino ou n = noturno)");
        opcao=entrada.next().charAt(0);

        if(opcao == 'm' || opcao == 'M') {
            System.out.println("Bom Dia!");
        }
        
        else if(opcao == 'v' || opcao == 'V') {
            System.out.println("Boa Tarde!");
        }

        else if(opcao == 'n' || opcao == 'N') {
            System.out.println("Boa Noite");
        }

        else {
            System.out.println("Valor invalido");

        }
    }
}