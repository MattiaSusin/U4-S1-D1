import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        System.out.println("----------------PERIMETRO DEL TRIANGOLO------------------------");
        double base = 50.8;
        double altezza = 26.7;

        double perimetro = base * altezza;

        System.out.println("Il permetro del rettangolo in questione è: " + perimetro);


        System.out.println("----------------PARI E DISPARI------------------------");
        int intero = 10;
        /* System.out.println("Il numero preso in esame: " + intero + "");*/
        if ((intero % 2) == 0) {
            System.out.println("E' pari");
        } else {
            System.out.println("E' dispari");
        }

        System.out.println("----------------PERIMETRO TRIANGOLO------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire i dati richiesti per calcolare l'area del Trianngolo");
        System.out.println("Inserire la base del triangolo");
        byte baseTr = scanner.nextByte();
        System.out.println("Inserire l'altezza del triangolo");
        byte altezzaTr = scanner.nextByte();
        int area = (baseTr * altezzaTr) / 2;

        System.out.println("L'Area del triangolo in questione è: " + area);

    }

}


/*
 *-1----> PERIMETRO DEL TRIANGOLO
 *-2----> PARI E DISPARI
 *-3----> PERIMETRO TRIANGOLO
 * */