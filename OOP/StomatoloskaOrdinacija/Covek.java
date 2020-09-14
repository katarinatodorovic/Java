package ordinacija;
// Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.

// Naziv i JMBG se zadaju prilikom kreiranja.

// Svi sadrzani podaci mogu samo da se dohvate.

// Novac moze da se doda i da se oduzme,

// gde je povratna vrednost indikator uspesnosti oduzimanja novca.

// Moze da se sastavi tekstualni zapis u obliku: IME_PREZIME[ID:JMBG:NOVAC]
/*for (char c : str.toCharArray())
    {
        if (!Character.isDigit(c)) return false;
    }
    return true;*/
public class Covek {
    private String ime;
    private String prezime;
    private static int ID_GLOBAL = 0;
    private int id;
    private String JMBG;
    private double novac;

    public Covek(String ime, String prezime, String JMBG) {
        this.prezime = prezime;
        this.ime = ime;
        boolean isOK = true;
        for (char c : JMBG.toCharArray()) {
            if (!Character.isDigit(c)) {
                isOK = false;
                break;
            }
        }

        if ((JMBG.length() == 13) && isOK) {
            this.JMBG = JMBG;
        } else System.out.println("Unesite ispravan JMBG");

        this.id = ID_GLOBAL++;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public static int getID_GLOBAL() {
        return ID_GLOBAL;
    }

    public String getJMBG() {
        return JMBG;
    }

    public double getNovac() {
        return novac;
    }

    public boolean dodajNovac(double novac) {
        boolean jeDodato = false;
        if (novac > 0) {
            this.novac += novac;
            jeDodato = true;
        } else {
            System.out.println("Ne mozete uplatiti negativnu kolicinu novca");
        }
        return jeDodato;
    }

    public boolean oduzmiNovac(double novac) {
        boolean jeSkinuto = false;
        if (this.novac >= novac) {
            this.novac -= novac;
            jeSkinuto = true;
        } else {
            System.out.println("Nemate dovoljno novca na racunu");
        }
        return jeSkinuto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(ime.toUpperCase()).append("_").
                append(prezime.toUpperCase()).append(" [").
                append(getId()).append(":").append(JMBG).append(":").append(getNovac()).append("]"));
    }
}
