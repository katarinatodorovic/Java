package racun;

import java.util.Random;

public class Racun {

    private String imeRadnje, ulicaIBroj,
            grad, datum, vreme,
            imeKasira;

    private int transakcija;

    private Artikli[] artikli = new Artikli[50];
    private int sledeciArtikal = 0;

    public Racun(String imeRadnje, String ulicaIBroj,
                 String grad, String datum,
                 String vreme, String imeKasira) {
        this.imeRadnje = imeRadnje;
        this.ulicaIBroj = ulicaIBroj;
        this.grad = grad;
        this.datum = datum;
        this.vreme = vreme;
        this.imeKasira = imeKasira;

        Random r = new Random();
        this.transakcija = r.nextInt(1000000);
    }

    public void dodajArtikal(Artikli a) {
        artikli[sledeciArtikal] = a;
        sledeciArtikal++;
    }

    public void stampajSeparator(int sirinaRacuna) {
        for (int i = 0; i < sirinaRacuna / 2; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }


    public void stampajRacun(int sirinaRacuna) {
        System.out.println("Radnja: " + imeRadnje);
        System.out.println(ulicaIBroj + ", " + grad);
        //sada treba one zvezdice na racunu
        stampajSeparator(sirinaRacuna);

        System.out.println("Datum: " + datum);
        System.out.println("Vreme: " + vreme);
        System.out.println("Kasir: " + imeKasira);
        //sada treba one zvezdice na racunu
        stampajSeparator(sirinaRacuna);

        double suma = 0.;
        for (int i = 0; i < sledeciArtikal; i++) {
            artikli[i].stampajArtikal(sirinaRacuna);
            suma += artikli[i].getCenaArtikla();
        }
        stampajSeparator(sirinaRacuna);

        double porez = suma * 0.2;
        double iznos = suma - porez;

        int sirinaZaNaziv = sirinaRacuna - 13;

        String format = "%%-%ds%%12.2f\n";
        String format2 = String.format(format, sirinaZaNaziv);
        System.out.printf(format2, "Ukupan iznos: ", iznos);
        System.out.printf(format2, "Ukupan porez: ", porez);
        System.out.printf(format2, "Ukupno za uplatu: ", suma);
        stampajSeparator(sirinaRacuna);

        System.out.println("Kasir: " + imeKasira);
        System.out.println("Broj transakcije: " + transakcija);
    }
}
