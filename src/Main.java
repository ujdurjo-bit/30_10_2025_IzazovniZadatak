import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1.
        //Napišite program koji:
        //1. učitava broj koji predstavlja iznos u eurima koji prodavačica treba
        //uzvratiti klijentu. (Demo klase Scanner)
        //2. Prodavačica uvijek uzvraća u najvećim novčanicama (kovanicama).
        //3. Program treba ispisati u koliko kojih novčanica (kovanica) treba uzvratiti.
        //4. Novčanice eura imaju vrijednost 500, 200, 100, 50, 20, 10 i 5 eura, a
        //kovanice su od 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02 i 0.01 eura. -> pohraniti
        //u polje
        //Očekivani izlaz - ako je unesena vrijednost 1978, program treba ispisati:
        //Morate uzvratiti:
        //3*500
        //2*200
        //1*50
        //1*20
        //1*5
        //1*2
        //1*1

//pretvorba iz string double parse double u int

        int[] novcanice = {500, 200, 100, 50, 20, 10, 5};
        double[] kovanice = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        Scanner sc = new Scanner(System.in);

            System.out.print("Unesite iznos u eurima koji je potrebno vratiti: ");
            double iznos = sc.nextDouble();
            int i = 0;
            double drIznos = iznos;
            int trenutnaVrj = 0;
            int brojNovcanica = 0;



        System.out.println("Vraćamo sljedeće novčanice:");

        for (i = 0; i < novcanice.length; i++) {
             trenutnaVrj = novcanice[i];
             brojNovcanica = (int) (drIznos / trenutnaVrj);

            if (brojNovcanica > 0) {
                System.out.println(brojNovcanica + " novčanice od " + trenutnaVrj + " €");
                drIznos = drIznos - (brojNovcanica * trenutnaVrj);
            }
        }

        System.out.println("Vraćamo i kovanice:");
        int j = 0;
        double trenutnaVrjKO = 0.0;
        int brojKovanica = 0;
        for (j = 0; j < kovanice.length; j++) {
            trenutnaVrjKO = kovanice[j];
            brojKovanica = (int)(drIznos / trenutnaVrjKO);

            if (brojKovanica > 0) {
                System.out.println(brojKovanica + " kovanicu od " + trenutnaVrjKO + " €");
                drIznos = drIznos-  (brojKovanica * trenutnaVrjKO);

            }
        }



        }
    }


