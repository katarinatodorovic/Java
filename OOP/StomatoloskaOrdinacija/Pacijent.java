package ordinacija;
// Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK

public class Pacijent extends Covek {
    public Pacijent(String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
    }

    @Override
    public String toString() {
        return "P_" + super.toString();
    }
}
