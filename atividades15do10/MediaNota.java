package atividades15do10;
import java.util.Scanner;

public class MediaNota {

    public static void main(String[] args) {
             Scanner ent = new Scanner(System.in);
            int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10;
            int media, i, contAluno = 0;

            for(i = 0; i < 3; i++){

                contAluno++;
               
                System.out.println("Aluno " + contAluno + ", digite sua 1� nota");
                nota1 = ent.nextInt();            
                System.out.println("Aluno " + contAluno + ", digite sua 2� nota");
                nota2 = ent.nextInt();              
                System.out.println("Aluno " + contAluno + ", digite sua 3� nota");
                nota3 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 4� nota");
                nota4 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 5� nota");
                nota5 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 6� nota");
                nota6 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 7� nota");
                nota7 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 8� nota");
                nota8 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 9� nota");
                nota9 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 10� nota");
                nota10 = ent.nextInt();
                
                media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / 3;
                System.out.println("A m�dia do aluno " + contAluno + " � " + media);

               
                if( (media >= 0) && (media <4) ){
                    System.out.println("Nota E");
                } else if(media < 5){
                    System.out.println("Nota D");
                } else if(media < 7){
                    System.out.println("Nota C");
                } else if(media < 8){
                    System.out.println("Nota B");
                } else if(media <= 10){
                    System.out.println("Nota A");
                }
            }
        }
    }