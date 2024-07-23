import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {

        System.out.println("----------------MOLTIPLICA----------------");

        int num1 = 8;
        int num2 = 3;
        int tot = num1 * num2;

        System.out.println("il risultato della somma è:" + tot);

        System.out.println("----------------CONCATENA----------------");

        String concatenazione = "Siamo in:";

        System.out.println(concatenazione + num1);

        System.out.println("----------------INSERISCI----------------");

        String[] strings = {"Gian", "Alberto", "Marco", "Federica", "Anastasia"};
        System.out.println(strings);

        String[] strings2 = new String[6];

        strings2 = Arrays.copyOf(strings, strings.length + 1);
        strings2[5] = "Anna";


        for (int i = 0; i < strings2.length; i++) {
            System.out.println("Elemento corrente " + strings2[i]);
        }


    }
}


/*
 *-1---->MOLTIPLICA:accetta due interi e ritorna il loro prodotto
 *
 *-2---->CONCATENA:accetta una stringa e un intero e restituisce una stringa che concatena gli elementi
 *
 *-3---->INSERISCI:inserisci un array di stringhe di 5 elementi
 *
 * */