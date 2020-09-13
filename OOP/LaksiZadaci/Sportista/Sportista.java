package noviPaket;

/*  Napisati klasu Sportista. Sportista ima
        1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
        2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
        3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
        4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje moze i da se dohvati i da se postavi.

        Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti
        (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
       */

public class Sportista {
    private String ime;
    private String prezime;
    private String vrstaSporta;
    private String imeKluba;
    private int brojDresa;

    public Sportista(String ime, String prezime, String vrstaSporta) {
        this.ime = ime;
        this.prezime = prezime;
        this.vrstaSporta = vrstaSporta;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getVrstaSporta() {
        return vrstaSporta;
    }

    public String getImeKluba() {
        return imeKluba;
    }

    public void setImeKluba(String imeKluba) {
        this.imeKluba = imeKluba;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }
}
