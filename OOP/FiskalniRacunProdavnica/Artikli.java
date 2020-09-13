package racun;

public class Artikli {
    private String nazivArtikla;
    private double cenaArtikla;

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public double getCenaArtikla() {
        return cenaArtikla;
    }

    public Artikli(String naziv, double cena) {
        this.nazivArtikla = naziv;
        this.cenaArtikla = cena;
    }

    public void stampajArtikal(int sirinaRacuna) {
        int sirinaZaNaziv = sirinaRacuna - 13;

        String nazivZaIspis = getNazivArtikla();

        if (getNazivArtikla().length() > sirinaZaNaziv) {
            nazivZaIspis = getNazivArtikla().substring(0, sirinaZaNaziv - 3) + "...";
        }
        String format = "%%-%ds%%12.2f\n";
        String format2 = String.format(format, sirinaZaNaziv);
        System.out.printf(format2, nazivZaIspis, getCenaArtikla());
    }
}
