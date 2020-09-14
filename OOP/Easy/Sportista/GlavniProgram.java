package noviPaket;

public class GlavniProgram {
    public static void main(String[] args) {
      /*  Napisati klasu Sportista. Sportista ima
        1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
        2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
        3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
        4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje moze i da se dohvati i da se postavi.

        Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti
        (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
       */

        Sportista sportista1 = new Sportista("Ljubusa", "Ljubic", "Voznja rolera");
        int brDresa = sportista1.getBrojDresa();
        System.out.println(brDresa);
        System.out.println(sportista1);
        sportista1.setBrojDresa(1555);
        System.out.println(sportista1.getBrojDresa());
        sportista1.setImeKluba("tamo neki");
        System.out.println(sportista1.getImeKluba());

    }
}
