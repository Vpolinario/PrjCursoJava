package atividades16do10;

import java.util.Scanner;
public class ClasseIdade {
public static void main(String[] args){

            int idade;
            int somaIdade = 0;
            int media = 0;
            int contaIdade = 0;
            String opcao = "S";
            Scanner scanner = new Scanner(System.in);

            while(opcao == "S") {

            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();


            somaIdade = somaIdade + idade;
            contaIdade = contaIdade + 1;
            media = contaIdade / somaIdade;

            System.out.println("Deseja informar outra idade? (S) ou (N): ");
            opcao = opcao.toUpperCase();
            opcao = scanner.next();
            } 

           if(media <= 25) {
               System.out.println("A turma é jovem");
           }else if(media <= 60) {
               System.out.println("A turma é adulta");
           }else {
           System.out.println("A turma é idosa");

           }
           }
           }