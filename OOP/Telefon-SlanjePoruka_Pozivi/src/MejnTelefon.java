package Telefon2.src;

public class MejnTelefon {
    public static void main(String[] args) {

        Broj br1 = new Broj("381", "345", "123456", false);
        Broj br2 = new Broj("381", "345", "123456", false);
        Broj br3 = new Broj("381", "344", "123456", false);
        System.out.println(br1.toString());
        Usluga poziv = new Poziv(br2, br3, 150);
        Poruka poruka = new Poruka(br1, br3, "Djes brate, sta radis evo nista a ti ja bzv.");
        System.out.println(poruka);
        System.out.println(poruka.tipUsluge(poruka));
        System.out.println(Broj.daLiJeBrojIzIsteDrzave(poziv));
        System.out.println(poziv);

        System.out.println(poruka.daLIJePorukaPoslata(poruka));

        System.out.println(poziv.tipUsluge(poziv));
        Korisnik korisnik = new Korisnik(br1, 150);
        korisnik.proslediPoruku(br3, "Djes brate, sta radis evo nista a ti ja bzv.");
        System.out.println(Korisnik.getSumaSvihUsluga());


    }
}
