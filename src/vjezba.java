import java.util.Scanner;

public class vjezba {
    public static void main(String[] args) {

/*  Tablica množenja
        int broj = 9;

        System.out.println("Tablica množenja za " + broj + ":");
        for (int i = 1; i <= 10; i++) {

            int rezultat = broj * i;
            System.out.println(broj + " × " + i + " = " + rezultat);
        }
*/
/*        //FizzBuzz - broj djeljiv sa tri Fizz, broj djeljiv sa 5 Buzz, oboje FizzBuzz

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz ");
            } else {
                System.out.print(i);

            }

        }*/
/*        int visina = 4;
        int sirina = 9;

        System.out.println("Pravokutnik:");
        for (int i = 0; i < visina; i++) {
            for (int j = 0; j < sirina; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Trokut
        System.out.println("\nTrokut:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // Tablica množenja 10×10
      /*  System.out.println("Tablica množenja:");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t"); // \t je tab
            }
            System.out.println();
        }*/

        //Zadatak 1: Napiši program koji ispisuje sve parne brojeve od 1 do 50
     /*   for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Ovo je paran broj:" + i);
            } else {
                System.out.println("Ovo nije paran broj:" + i);
            }*/

        //Zadatak 3: Napiši program koji ispisuje Fibonaccijev niz do 100
       /* int niz = 1;
        int a = 0;
        int b = 1;


        for (int c = 0; c < 100; c++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);

        }*/
        Scanner sc = new Scanner(System.in);
        System.out.print("koji broj želite provjeriti? ");
        int broj = Integer.parseInt(sc.nextLine());
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0)
            {
                System.out.print("Broj nije prost.");
            }
            else {
                System.out.print("Broj je prost.");

            }

        }



    }
}










