import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
/*        Zadatak 2.
        Napisati program koji:
        1. Učitava fiksni broj visina (npr. 10) studenata. -> pitati korisnika koliko
        visina želi unijeti.
        2. Pohranjuje te visine u polje (array).
        3. Koristeći petlje, izvršava analizu nad unesenim podacima.
        Koraci
        1. Deklaracija Polja:
        o Deklarirajte polje realnih brojeva (npr. double ili float) fiksne veličine
        (npr. 10) za pohranu visina u metrima.

        2. Unos Podataka (Petlja za Unos):
        o Koristeći for petlju, omogućite korisniku da unese točno 10 visina (u
                metrima) i pohranite ih redom u polje.
        3. Analiza Podataka (Petlje za Obradu):
        o Izračun Prosjeka: Koristeći drugu for petlju ili modificirajući prvu,
        izračunajte prosječnu visinu svih unesenih studenata.
        o Pronalaženje Ekstrema: Pomoću petlje, pronađite i ispišite najnižu
        i najvišu unesenu visinu.
        o Prebrojavanje: Koristeći petlju, prebrojite i ispišite:
▪ Koliko studenata ima visinu iznad prosjeka.
▪ Koliko studenata ima visinu ispod 1.75 metara.

                Očekivani izlaz:
        Prosječna visina: 1.78 metara
        Najniža visina: 1.62 metara
        Najviša visina: 1.95 metara
        Broj studenata iznad prosjeka (1.78m): 4
        Broj studenata ispod 1.75m: 3*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko visina želite unijeti? ");
        int brojVisina = Integer.parseInt(sc.nextLine());
        int i = 0;



        double[] visine = new double[brojVisina];

        for ( i = 0; i < brojVisina; i++) {
            System.out.println("Unesite visinu " + (i + 1) + ":");
            double visina = Double.parseDouble(sc.nextLine());

                visine[i] = visina;
        }
        double prosjek = 0.0;
        double zbroj = 0;
        double najvisa = 0;
        double najniza = visine[0];

        for (i = 0; i < brojVisina; i++) {
            zbroj = zbroj + visine[i];

        }
        prosjek = zbroj / brojVisina;
        System.out.println("Prosječna visina: " + prosjek + " metara");


        for ( i = 1; i < brojVisina; i++) {
            if (visine[i] > najvisa) {
                najvisa = visine[i];
            }
            if (visine[i] < najniza) {
                najniza = visine[i];
            }
        }

        System.out.println("Najviša visina: " + najvisa + " metara");
        System.out.println("Najniža visina: " + najniza + " metara");

        int iznadProsjeka = 0;
        int ispodProsjeka = 0;

        for (i = 0; i < brojVisina; i++) {
            if (visine[i] > prosjek) {
                iznadProsjeka++;
            }
            if (visine[i] < 1.75) {
                ispodProsjeka++;
            }
        }

        System.out.println("Broj studenata iznad prosjeka: " + iznadProsjeka);
        System.out.println("Broj studenata ispod 1.75m: " + ispodProsjeka);


        }
    }
