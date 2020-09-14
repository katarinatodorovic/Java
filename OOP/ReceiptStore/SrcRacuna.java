package racun;

public class SrcRacuna {
    public static void main(String[] args) {


        Racun r = new Racun("Doo Roda", "Prizrenska 12", "Beograd", "2020-5-25", "14:00:05", "Slobodan Rodic");
        r.dodajArtikal(new Artikli("Kokice", 99.95));
        r.dodajArtikal(new Artikli("Plazma sa cokoladom", 165.00));
        r.dodajArtikal(new Artikli("Macmelow", 88.5));
        r.dodajArtikal(new Artikli("Staklena Tava - cetvrtasta", 987.12));
        r.dodajArtikal(new Artikli("Svinjski but", 800));
        r.dodajArtikal(new Artikli("Stavka kojoj je ime jako dugacko pa mora da se", 800));

        r.stampajRacun(40);
    }
}
