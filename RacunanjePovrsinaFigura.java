import java.util.Scanner;

public class RacunanjePovrsinaFigura {

    public static Scanner sc = new Scanner(System.in);

    //Ovaj kod predstavlja kalkulator povrsina
    //kvadrata, pravougaonika i kruga.
    //Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
    //Ukoliko se unese 'izadji', program treba da se zavrsi.
    //Program treba da se ponavlja dokle god se ne unese izadji.


    public static void main(String[] args) {
        System.out.println("Unesite figuru za koju zelite da uradite povrsinu, ponudjene su" +
                " krug, kvadrt, pravougaonik. Za prekid programa unesi rec izadji.");

        String figura;
        loop:
        while (true) {
            figura = sc.nextLine().toLowerCase().replaceAll("\\s","");
            switch (figura) {

                case "kvadrat":
                    racunajKvadrat();
                case "pravougaonik":
                    racunajPravougaonik();
                case "krug":
                    racunajKrug();
                    break;
                case "izadji":
                    System.exit(1);
                default:
                    System.out.println("Unesite ponovo figuru! Nije dobra! ");
                    break;
            }
            System.out.println("Unesite figuru ponovo: ");
            figura = sc.nextLine().toLowerCase().replaceAll("\\s","");
            continue loop;

        }
    }

    public static void racunajKrug() {
        System.out.println("Unesite poluprecnik kruga: ");
        double r;
        r = sc.nextDouble();
        if (r <= 0) {
            System.out.println("Los unos!");
            return;
        }
        System.out.println("Povrsina kruga je: " + pKruga(r));
    }

    public static void racunajPravougaonik() {
        double a, b;
        System.out.println("Unesite stranice pravougaonika: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a <= 0 || b <= 0) {
            System.out.println("Los unos!");
            return;
        }
        System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));
    }

    public static void racunajKvadrat() {
        System.out.println("Unesite stranicu kvadrata:");
        double a;
        a = sc.nextDouble();
        if (a <= 0) {
            System.out.println("Los unos!");
            return;
        }
        System.out.println("Povrsina kvadrata je: " + pKvadrata(a));
    }

    public static double pKruga(double r) {
        return r * r * Math.PI;
    }

    public static double pKvadrata(double a) {
        return a * a;
    }

    public static double pPravougaonika(double a, double b) {
        return a * b;
    }
}
