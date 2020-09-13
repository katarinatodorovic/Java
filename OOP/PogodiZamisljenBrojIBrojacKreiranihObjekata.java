package proba;

class PogodiZamisljenBrojIBrojacKreiranihObjekata {
    public final static int ZAMISLJEN_BROJ = 4;
    public String naziv;
    public static String opis;

    public static int count = 0;
    public int id;

    public PogodiZamisljenBrojIBrojacKreiranihObjekata() {
        id = count;
        count++;
    }

    public void prikaziIme() {
        System.out.println(" ID objekta je: " + id + ", " + opis + ": " + " Trenutno igra: " + naziv);
    }

    public static void prikaziInfo() {
        System.out.println(opis);//static metod samo moze da radi sa static variablama
    }
}

public class PablikIFinal {
    public static void main(String[] args) {
        PogodiZamisljenBrojIBrojacKreiranihObjekata.opis = "Cilj igre je da pogodis zamisljen broj";
        PogodiZamisljenBrojIBrojacKreiranihObjekata.prikaziInfo();

        System.out.println("Pre kreiranja objekata broj je: " + PogodiZamisljenBrojIBrojacKreiranihObjekata.count);
        PogodiZamisljenBrojIBrojacKreiranihObjekata objekat1 = new PogodiZamisljenBrojIBrojacKreiranihObjekata();
        PogodiZamisljenBrojIBrojacKreiranihObjekata objekat2 = new PogodiZamisljenBrojIBrojacKreiranihObjekata();
        System.out.println("POSLE kreiranja objekata broj je: " + PogodiZamisljenBrojIBrojacKreiranihObjekata.count);// broji koliko je kreirano objekata


        objekat1.naziv = "Igrac";
        objekat2.naziv = "Robot";

        objekat1.prikaziIme();
        objekat2.prikaziIme();

        System.out.println("Zamisljen broj je: " + PogodiZamisljenBrojIBrojacKreiranihObjekata.ZAMISLJEN_BROJ);
    }
}

