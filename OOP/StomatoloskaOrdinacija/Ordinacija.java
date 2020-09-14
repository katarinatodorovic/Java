package ordinacija;
// Ordinacija poseduje naziv, listu stomatologa, listu pacijenata,
// cenu usluge kao i stanje racuna.
// Naziv i cena  se zadaju prilikom kreiranja i mogu samo da se dohvate.
//	Moze da se naplati usluga pacijentima,
//  ali ukoliko neki pacijent ne poseduje dovoljno novca
// ispisuje se poruka: “PACIJENT ide u zatvor”.
// Ordinacija takodje moze da isplati platu stomatolozima u zadatom iznosu,
// a povratna vrednost je indikator da li je plata uspesno isplacena

import java.util.ArrayList;


public class Ordinacija {
    private String naziv;
    private ArrayList<Stomatolog> stomatolozi = new ArrayList<>();
    private ArrayList<Pacijent> pacijenti = new ArrayList<>();
    private double cenaUsluge;
    private double stanjeRacuna;
    private double plate;


    public Ordinacija(String naziv, double cenaUsluge) {
        this.naziv = naziv;
        this.cenaUsluge = cenaUsluge;
    }

    public double getPlate() {
        return plate;
    }

    public void setPlate(double plate) {
        this.plate = plate;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCenaUsluge() {
        return cenaUsluge;
    }

    public ArrayList<Stomatolog> getStomatolozi() {
        return stomatolozi;
    }

    public void setStomatolozi(ArrayList<Stomatolog> stomatolozi) {
        this.stomatolozi = stomatolozi;
    }

    public ArrayList<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(ArrayList<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public void setStanjeRacuna(double stanjeRacuna) {
        this.stanjeRacuna = stanjeRacuna;
    }

    public void addStomatologa(Stomatolog s) {
        stomatolozi.add(s);
    }

    public void removeStomatologa(Stomatolog s) {
        stomatolozi.remove(s);
    }

    public void addPacijenta(Pacijent p) {
        pacijenti.add(p);
    }

    public void removePacijenta(Pacijent p) {
        pacijenti.remove(p);
    }

    public boolean naplatiUslugu(Pacijent p) {
        boolean uslugaJeNaplacena = false;
        if (p.getNovac() < this.cenaUsluge) {
            System.out.println("PACIJENT ide u zatvor");

        } else {
            p.oduzmiNovac(this.cenaUsluge);
            uslugaJeNaplacena = true;
        }
        return uslugaJeNaplacena;
    }

    public boolean primiPlatu(Stomatolog s) {
        boolean jePrimio = false;
        if (this.plate > 0) {
            s.dodajNovac(this.plate);
            jePrimio = true;
        } else {
            System.out.println("Ne mozete uplatiti negativnu kolicinu novca");
        }
        return jePrimio;
    }
}
