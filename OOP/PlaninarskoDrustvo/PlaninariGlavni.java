public class PlaninariGlavni {
    public static void main(String[] args) {
        /*Napomena: U glavnom programu planinare kreirati iskljucivo preko metode
         registruj klase PlaninarskoDrustvo.
Kreiranje Planinara na drugi nacin je dozvoljeno radi testiranja samo i ukoliko
klasa PlaninarskoDrustvo nije napisana.
Ukoliko je klasa PlaninarskoDrustvo napisana, kreiranje se vrsi iskljucivo preko
 metode registruj klase PlaninarskoDrustvo.
Za vodjenje spiska planinara u klasi PlaninarskoDrustvo dozvoljeno je koriscenje
klase List. Dozvoljeno je i citanje*/

        Osoba osoba1 = new Osoba("Pero", "Perisic", 1952, "1111111111111");
        Osoba osoba2 = new Osoba("Milivoje", "Milic", 1989, "2222222222222");
        Osoba osoba3 = new Osoba("Oblo", "Oblic", 2015, "3333333333333");
        Osoba osoba4 = new Osoba("Seco", "Secovic", 1990, "4444444444444");
        Osoba osoba5 = new Osoba("Pero", "Perisic", 1915, "1111111111111");
        Osoba osoba6 = new Osoba("Pero", "Perisic", 2020, "111111q111111");
        System.out.println(osoba5);
        System.out.println(osoba6);
        System.out.println(osoba6.getIme());
        System.out.println(osoba3.toString());
        System.out.println(osoba3.getJMBG());


        PlaninarskoDrustvo drustvo = new PlaninarskoDrustvo("Skupina");
        drustvo.dodajPlaninara(drustvo.kreirajPlaninara(osoba2, "1111111"));
        drustvo.dodajPlaninara(drustvo.kreirajPlaninara(osoba3, "2222222"));
        drustvo.dodajPlaninara(drustvo.kreirajPlaninara(osoba4, "4444444"));
        drustvo.dodajPlaninara(drustvo.kreirajPlaninara(osoba1, "5555555"));
        Planinar p = new Planinar("Olga", "Perisic", 1982, "7777777777777", "1234567");
        drustvo.dodajPlaninara(p);
        System.out.println(drustvo.isInList(p));
        System.out.println(drustvo.toString());
        System.out.println(Planinar.kreirajPlaninara(new Osoba("Vaha", "Vahic", 2000, "8888888888888"), "9999999").toString());


        drustvo.ukloniPlaninara(p);
        System.out.println(drustvo.getNazivDrustva());
        System.out.println(drustvo.toString());

        System.out.println(drustvo.toString());


    }
}
