import java.util.Scanner;

/*Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu.
Prikazati transformirani string s obrnutim redoslijedom riječi.
Primjer ulaza: Dobar dan svima
Primjer izlaza: svima dan Dobar*/
public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite željenu rečenicu: ");
        String text = sc.nextLine();

       // String text = "Danas je    novi aa daaan";
        String[] characters = text.split("\\s+");
//        String[] characters = text.split("[\\s]");

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i] + " ");
        }


        }
    }


