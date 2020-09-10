import java.util.Scanner;

public class PogodiZamisljenuRec {
    public static void main(String[] args) {
 /*Napisati program u programskom jeziku Java koji ispunjava sledece funkcionalnosti:
Sacuva jednu rec proizvoljno odabranu u jednoj promeljivoj.
Omogucava korisniku da unosi reci sve dok ne pogodi rec koja je odabrana u prethodnom koraku.
Nakon svakog korisnickog unosa ispisati poruku da li je pogodio rec ili nije
Sacuvati zadatak koji ispunjava prethodne zahteve.
Modifikovati ga tako da korisnik moze da pogadja rec najvise pet puta.
Koristiti for petlju, da provezbamo jos malo :)*/


        Scanner sc = new Scanner(System.in);
        String skrivenaRec = "zagonetka";
        String pokusaj;
        int pok;

        for (int i = 0; i < 5; i++) {
            pok = 4 - i;

            System.out.println("Unesi rec: ");
            pokusaj = sc.nextLine();
            if (pokusaj.equals(skrivenaRec)) {
                System.out.println("Bravo, pogodili ste zamisljenu rec!");
                break;
            } else if (i == 4) {
                System.out.println("Ne mozete vise da pogadjate, iskoristili ste svih 5 pokusaja!");
            } else {
                System.out.println("Niste pogodili ste zamisljenu rec, pokusajte ponovo." +
                        "Ostalo vam je da pokusate jos: " + pok);
            }
        }
    }
}
