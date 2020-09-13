package ocenjivanje;

public class Test {
    private String predmet;
    private String nazivTesta;
    private int brojPitanja;
    private double brojTacnihOdgovora;

    public String getPredmet() {
        return predmet;
    }

    public String getNazivTesta() {
        return nazivTesta;
    }

    public int getBrojPitanja() {
        return brojPitanja;
    }

    public double getBrojTacnihOdgovora() {
        return brojTacnihOdgovora;
    }

    /*getBrojNetacnihOdgovora*/
    public double brojNetacnihOdgovora() {
        return brojPitanja - brojTacnihOdgovora;
    }

    /*getBrojPoena*/
    public double brojPoena() {
        return 30. * getBrojTacnihOdgovora() / getBrojPitanja();
    }

    public Test(String predmet, String nazivTesta,
                int brojPitanja, int brojTacnihOdgovora) {
        this.predmet = predmet;
        this.nazivTesta = nazivTesta;
        this.brojPitanja = brojPitanja;
        this.brojTacnihOdgovora = brojTacnihOdgovora;
    }

    public enum REZULTAT_TESTA {PAO, USLOVNO_POLOZIO, POLOZIO}

    public REZULTAT_TESTA oceniTest() {
        double poeni = brojPoena();
        if (poeni < 11) {
            return REZULTAT_TESTA.PAO;
        }
        if (poeni >= 11 && poeni < 17) {
            return REZULTAT_TESTA.USLOVNO_POLOZIO;
        } else {
            return REZULTAT_TESTA.POLOZIO;
        }
    }

    @Override
    public String toString() {
        String opisnaOcena = "";

        REZULTAT_TESTA rezultat = oceniTest();

        switch (rezultat) {
            case PAO:
                opisnaOcena = "PAO";
                break;
            case USLOVNO_POLOZIO:
                opisnaOcena = "USLOVNO POLOZIO";
                break;
            case POLOZIO:
                opisnaOcena = "POLOZIO ";
                break;

        }

        // neformatirani prikaz

        /* return getPredmet() + " " + getNazivTesta() + " " +
                +getBrojTacnihOdgovora() + "/"
                + getBrojPitanja() + " " + brojPoena() + " "
                + opisnaOcena;}*/

      /* String format = "%s\t%s\t%f/%d\t%f\t%s\n";
        String konacanString = String.format(format, getPredmet(),
                getNazivTesta(), getBrojTacnihOdgovora(),
                getBrojPitanja(), brojPoena(), opisnaOcena);*/
        //return konacanString;

        return String.format("%-30s\t%-30s\t%6.2f / %3d\t%.2f\t%s",
                getPredmet(), getNazivTesta(),
                getBrojTacnihOdgovora(),
                getBrojPitanja(), brojPoena(), opisnaOcena);


    }
}
