/*
* Planinar je osoba koja poseduje broj planinarske dozvole, broj planinarske
*  dozvole mora da ima tacno 7 karaktera. Broj
planinarske dozvole se postavlja prilikom kreiranja i moze se samo dohvatiti.
* Ukoliko se stavi nedozvoljena vrednost, postaviti
broj planinarske dozvole na "0000000".
Klasa Planinar poseduje staticku metodu kreiraj(Osoba o, String brojDozvole)
* koja prima kao argument objekat tipa Osoba
a vraca objekat tipa Planinar. Metoda kreiraj za poslatu osobu kreira planinara
* i vraca objekat, to jest uzima informacije iz
objekta tipa Osoba i kreira objekat tipa Planinar. (Prisetiti se sa predavanja
* klase Banka i otvaranja racuna);
Primer poziva metode kreiraj:
Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
Planinar p1 = Planinar.kreiraj(o1,"1234567");
Planinar moze da se ispise u sledecem obliku:
[Ime Prezime]{GodinaRodjenja}<JMBG> - BrojDozvole
* */

public class Planinar extends Osoba {

    private String brojPlaninarskeDozvole;
    private static final int DOZVOLA = 7;


    public Planinar(String ime, String prezime, int godinaRodjenja, String JMBG, String brojPlaninarskeDozvole) {
        super(ime, prezime, godinaRodjenja, JMBG);
        if (brojPlaninarskeDozvole.length() == DOZVOLA && proveriBroj(brojPlaninarskeDozvole)) {
            this.brojPlaninarskeDozvole = brojPlaninarskeDozvole;
        } else {
            System.out.println("Broj planinarkse dozvole  nije ispravan, bice mu dodeljen defoltni");
            this.brojPlaninarskeDozvole = "0000000";
        }

    }

    public String getBrojPlaninarskeDozvole() {
        return brojPlaninarskeDozvole;
    }
   
    public static Planinar kreirajPlaninara(Osoba o, String brojDozvole) {
        Planinar p = new Planinar(o.getIme(), o.getPrezime(), o.getGodinaRodjenja(), o.getJMBG(), brojDozvole);
        return p;
    }
    @Override
    public String toString() {
        return super.toString() + " - " + getBrojPlaninarskeDozvole();
    }
}
