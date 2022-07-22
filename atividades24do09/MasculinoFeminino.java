package atividades24do09;


import java.util.Scanner;

public class MasculinoFeminino {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu sexo - F/f(feminino) , M/m(masculino):");
        String sexo = teclado.next(); 
        if ("f".equalsIgnoreCase(sexo)){
            System.out.println("sexo feminino!");
        }else if("m".equalsIgnoreCase(sexo)){
            System.out.println("sexo masculino!");
        }else{
            System.out.println("sexo Invalido!");
        }
    }
}
