package ordinacija;

// Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK
public class Stomatolog extends Covek {

    public Stomatolog(String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
    }

    @Override
    public String toString() {
        return "S_" + super.toString();
    }
}
