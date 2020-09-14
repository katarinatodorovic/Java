package definisanjeklasagetterasettera;

import java.util.Scanner;

class Vektor {

    private double x, y;

    /*treba nam geteri i seteri za x i y jer su varijable
     * privatne i da bi nasa glavna klasa moglad aim pristupi
     * mi moramo da imamo geter da bi ih printali
     * i sseter da bismo im zadali vrednost*/
    public double getX() {
        return x;
    }

    /*ovde se this.x odnosi na private double x a drugo x iz setera
    * to je ono sto je pricao Meron da je malo pogresno kada dajemo
     ista imena bez potrebe*/
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*mislim da nam ovde nije potrebna rec this jer postoji varijabla x samo
     * gore tako da mislim da je to suvisno isto sto je pricao Meron*/
    public Vektor() {
        this.x = 0.0;
        this.y = 0.0;

    }

    public Vektor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*pravi novi vektor cije vrednosti su iste kao i prvi vektor
     * kopira tj klonira vektor*/
    public Vektor(Vektor v) {
        this.x = v.getX();
        this.y = v.getY();
    }

    /*sabiranje vektora se vrsi sabiranjem njegovih x i y vr tj x+x2 =x3
     * i isto tako za y da se to ne bi radilo svaki put za nivu vektor
     * napravljen je metod dole saberi tj x i y datog vektora se sabiraju
     * sa dimenzijama novog vektora i on nakon toga ima nove vrednosti */
    /*Kada zelio da pristupimo funkciji saberi mi moramo da objekat klase vektor
     * a koda zelimo da pristupimo metodu bez da se napravi
     * objekat tog metoda dodajemo rec   static*/
    public void saberi(Vektor v) {

        this.x += v.getX();
        this.y += v.getY();
    }

    public void oduzmi(Vektor v) {

        this.x -= v.getX();
        this.y -= v.getY();
    }

    public void skaliraj(double skalar) {
        this.x *= skalar;
        this.y *= skalar;
    }

    public double intezitet() {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
    }

    /*da ne bi svaki put pisali sysout i koordinate svakog
    vektora koristimo ovo koristi override jer  System.out.println("V1 = " + v1);
    svaki novi vektor je razlicit i onda koristi njegove karakteristike*/
    @Override
    public String toString() {
        return "Vektor { " +
                "x = " + x +
                ", y = " + y +
                " }";
    }

    /*da ne bi rucno unosili mozemo i da pitamo korisnika da unese
     * vrednosti vektora tj x i y komponente
     * nove komponente koje smo uneli za x i y bice dodeljene novom
     * vektoru napravljenom iz klase vektor
     * prvi broj koji unosim je x brednost novog vektora
     * a druga y vrednost*/
    public static Vektor unosSaTastature() {
        Scanner s = new Scanner(System.in);
        Vektor v = new Vektor();
        System.out.println("Unesite velicine komponenata vektora  (x i y vrednosti) odvojene razmakom: ");

        v.setX(s.nextDouble());
        v.setY(s.nextDouble());

        return v;

    }

    public static void zameni(Vektor a, Vektor b) {
        double privremenoX = a.getX();
        a.setX(b.getX());
        b.setX(privremenoX);

        double privremenoY = a.getY();
        a.setY(b.getY());
        b.setY(privremenoY);

    }

    public enum POREDAK {OPADAJUCI, RASTUCI}

    public static void sort(Vektor[] niz2, POREDAK poredak) {
        for (int j = 0; j < niz2.length - 1; j++) {
            for (int i = 0; i < niz2.length - 1; i++) {
                if (poredak == POREDAK.RASTUCI) {
                    if (niz2[i].intezitet() > niz2[i + 1].intezitet()) {
                        Vektor.zameni(niz2[i], niz2[i + 1]);
                    }
                } else if (poredak == POREDAK.OPADAJUCI) {
                    if (niz2[i].intezitet() < niz2[i + 1].intezitet()) {
                        Vektor.zameni(niz2[i], niz2[i + 1]);
                    }
                }

            }
        }
    }
}



