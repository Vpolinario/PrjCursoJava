package atividades17do10;

public class Tabuada {

    public static void main(String[] args){
        int valor = 6;
        int total;

        System.out.println("Tabuada do valor " + valor);

        for (int i = 3; i <= 8; i++){
            total = valor * i;
            //6 x 1 = 6
            //6 x 2 = 12
            System.out.println(valor + " x " + i + " = " + total);
        }
    }
}