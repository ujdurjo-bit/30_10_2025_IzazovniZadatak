import java.util.Scanner;

public class Zadatak1_ {
    public static void main(String[] args) {
    // Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova, koliko brojeva i koliko "ostalih znakova".
        // Npr. ako je uneseni niz znakova "Danas je 27.02.2010.", program treba ispisati:
        //
        //Slova: 7
        //Brojevi: 8
        //Ostali znakovi: 5
        Scanner sc = new Scanner(System.in);
        System.out.print("koji string želite provjeriti? ");
        String unos = sc.nextLine();

        int slova = 0;
        int brojeva = 0;
        int ostZNK = 0;

        String svaSlova = "abcčćdđefghijklmnopqrsštuvwxyzžABCČĆDĐEFGHIJKLMNOPQRSŠTUVWXYZŽ";
        String sviBrojevi = "0123456789";

        for (int i = 0; i < unos.length(); i++) {
            char znak = unos.charAt(i);
            String znakStr = String.valueOf(znak);

            if (svaSlova.contains(znakStr)) {
                slova++;

            } else if (sviBrojevi.contains(znakStr)) {
                brojeva++;

            } else {
                ostZNK++;
            }

        }

        System.out.println("Slova: " + slova);
        System.out.println("Brojevi: " + brojeva);
        System.out.println("Ostali znakovi: " + ostZNK);

    }

}
