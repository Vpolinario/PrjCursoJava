package atividades15do10;
import java.util.Scanner;

public class MediaNota {

    public static void main(String[] args) {
             Scanner ent = new Scanner(System.in);
            int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10;
            int media, i, contAluno = 0;

            for(i = 0; i < 3; i++){

                contAluno++;
               
                System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
                nota1 = ent.nextInt();            
                System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
                nota2 = ent.nextInt();              
                System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
                nota3 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
                nota4 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 5ª nota");
                nota5 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 6ª nota");
                nota6 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 7ª nota");
                nota7 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 8ª nota");
                nota8 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 9ª nota");
                nota9 = ent.nextInt();
                
                System.out.println("Aluno " + contAluno + ", digite sua 10ª nota");
                nota10 = ent.nextInt();
                
                media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / 3;
                System.out.println("A média do aluno " + contAluno + " é " + media);

               
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