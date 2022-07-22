package atividades06do10;

import java.util.Scanner;

public class loginesenha {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("login> ");
        String login = in.nextLine();
        
        System.out.println("senha> ");
        String senha = in.nextLine();
      
        if(login.equals(" Vinícius ") && senha.equals("00000000")){
            System.out.printf(" login feito com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}