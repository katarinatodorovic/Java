/*Ova klasa prati sledece podatke o studentu
 * kao sto su studentovo ime i id broj i broj poena koje je potrebno da ima
 * da bi diplomirao 240 espb bodova sve informacije su
 * privatne za klasu. korisnik moze pristupiti informacijama
 * samo ako koristi razalicite metode koje su definisane unutar klase */

public class DaLiJeDiplomirao {

    /**
     * kreira objekat zvani DaliJeDiplomirao odredjeni student sa odredjenim imenom i
     *
     * @param ime studentovo ime u obliku String
     * @param id  studentov id broj kao int
     * @ param mora da se stavi na pocetku inace ako ima neka druga rec ispred ne detektuje
     * kao parametar vec kao obican deo komentara
     */


    public DaLiJeDiplomirao(String ime, int id) {
        imeStudenta = ime;
        idStudenta = id;
    }

    /**
     * Kreira String koji identifikuje studenta
     *
     * @return String koji se koristi da se prikaze ime studenta
     */

    public String getIme() {
        return imeStudenta;
    }

    /**
     * Kreira int koji identifikuje id studenta
     *
     * @return int koji se koristi da se prikaze identifikacioni broj studenta
     */

    public int getId() {
        return idStudenta;
    }

    /**
     * @param bodovi novi broj prikupljenih bodova
     */
    public void setujBodove(double bodovi) {
        brojPrikupljenihBodova = bodovi;
    }

    /**
     * @return double vrednost do tada prikupljenih bodova
     */
    public double getBodovi() {
        return brojPrikupljenihBodova;
    }

    /**
     * @param dodatniBodovi bodove na prikupljene bodove svaki put
     *                      kada je student polozio odredjeni ispit koji nosi neki broj ESPB bodova-broj dodatnih bodova
     */
    public void dodajBodove(double dodatniBodovi) {
        brojPrikupljenihBodova += dodatniBodovi;
    }

    public boolean imaDovoljnoBodova() {
        return (brojPrikupljenihBodova >= BROJ_ESPB_BODOVA_ZA_DIPLOMIRANJE);
    }

    /**
     * @return String koji identifikuje studenta
     */
    public String toString() {
        return imeStudenta + " (#" + idStudenta + ")";
    }

    public static final double BROJ_ESPB_BODOVA_ZA_DIPLOMIRANJE = 240.0;

    private String imeStudenta;
    private int idStudenta;
    private double brojPrikupljenihBodova;
}

