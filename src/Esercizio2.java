import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        System.out.println("----------------------------------------- SCANNER -----------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao inserisci (per esteso) il giorno di nascita:");
        String giorno = scanner.nextLine();

        System.out.println("Ok,sei nato il " + giorno + " Ora inserisci il mese di nascita:");
        String mese = scanner.nextLine();

        System.out.println("Ok,sei nato il " + giorno + "," + mese + " Infine il luogo di nascita:");
        String luogo = scanner.nextLine();

        System.out.println("Quindi sei nato il: " + giorno + "," + mese + " a " + luogo + ",grazie mille");

    }
}
