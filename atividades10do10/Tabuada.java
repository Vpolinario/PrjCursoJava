package atividades10do10;

public class Tabuada {

    public static void main(String[] args){
        int valor = 5;
        int total;

        System.out.println("Tabuada do valor " + valor);

        for (int i = 1; i <= 10; i++){
            total = valor * i;
            //5 x 1 = 5
            //5 x 2 = 10
            System.out.println(valor + " x " + i + " = " + total);
        }
    }
}
