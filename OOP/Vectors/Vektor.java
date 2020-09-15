package definisanjeklasagetterasettera;

import java.util.Scanner;

class Vektor {

    private double x, y;

    
    public double getX() {
        return x;
    }

   
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

   
    public Vektor() {
        this.x = 0.0;
        this.y = 0.0;

    }

    public Vektor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public Vektor(Vektor v) {
        this.x = v.getX();
        this.y = v.getY();
    }

    /*sabiranje vektora se vrsi sabiranjem njegovih x i y vr tj x+x2 =x3
     * i isto tako za y da se to ne bi radilo svaki put za nivu vektor
     * napravljen je metod  saberi tj x i y datog vektora se sabiraju
     * sa dimenzijama novog vektora i on nakon toga ima nove vrednosti */
    
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

   
    @Override
    public String toString() {
        return "Vektor { " +
                "x = " + x +
                ", y = " + y +
                " }";
    }

  
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



