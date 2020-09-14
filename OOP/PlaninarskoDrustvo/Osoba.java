/*Osoba poseduje Ime, Prezime, godinu rodjenja i JMBG. Ime, prezime,
godina rodjenja i JMBG se zadaju prilikom kreiranja. Ime
i prezime mogu da se dohvate i naknadno postave. Godina rodjenja i
 JMBG mogu samo da se dohvate. Izvrsiti proveru
ispravnosti JMBG-a, to jest JMBG mora da ima tacno 13 karaktera.
 Ukoliko JMBG format nije ispravan za JMBG staviti
"0000000000000".
Osobu je moguce ispisati u sledecem obliku:
[Ime Prezime]{GodinaRodjenja}<JMBG>
* */

public class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private String JMBG;
    private static final int JMBGDOZ = 13;

    public Osoba(String ime, String prezime, int godinaRodjenja, String JMBG) {
        this.ime = ime;
        this.prezime = prezime;
        if (godinaRodjenja > 1915 && godinaRodjenja < 2019) {
            this.godinaRodjenja = godinaRodjenja;
        } else System.out.println("Ne moze se kreirati osoba sa tom godinom rodjenja.");


        if (JMBG.length() == JMBGDOZ && proveriBroj(JMBG)) {
            this.JMBG = JMBG;
        } else {
            System.out.println("JMBG nije ispravan, bice mu dodeljen defoltni.");
            this.JMBG = "0000000000000";
        }

    }

    public static boolean proveriBroj(String zaProveru) {
        boolean daLiJeBroj = true;
        char[] c = zaProveru.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!Character.isDigit(c[i])) {
                daLiJeBroj = false;
                break;
            }
        }
        return daLiJeBroj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }


    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public String getJMBG() {
        return JMBG;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(getIme()).append(" ").append(getPrezime()).append("]").
                append("{").append(getGodinaRodjenja()).append("}").append("<").append(JMBG).append(">");
        return String.valueOf(sb);
    }
}
