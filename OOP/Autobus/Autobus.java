import java.util.ArrayList;

public class Autobus {

    /*
     * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
     * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
     * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
     * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
     * - Putnik1[novac], Putnik2 [novac],... )
     */

    private String naziv;
    private static Vozac vozac;
    private double cenaKarte;
    private ArrayList<Putnik> putnici = new ArrayList<>();


    public Autobus(String naziv, double cenaKarte) {
        if (!naziv.equals(""))this.naziv = naziv;
        else System.out.println("Mora postojati ime autobusa.");
        if (cenaKarte>0)this.cenaKarte = cenaKarte;
        else System.out.println("Cena karte mora biti veca od nule.");
    }

    public void setCenaKarte(double cenaKarte) {
        if (cenaKarte > 0) {
            this.cenaKarte = cenaKarte;
        } else System.out.println("Niste uneli odgovarajucu cenu karte.");
    }

    public static Vozac getVozac() {
        return vozac;
    }

    public ArrayList<Putnik> getPutnici() {
        return putnici;
    }

    public void dodajPutnika(Putnik putnik){
        boolean isThere = false;
        for (int i = 0; i < putnici.size(); i++) {
            if (putnici.get(i).getIme_I_prezime().toLowerCase().replaceAll("\\s", "").
                    equals(putnik.getIme_I_prezime().toLowerCase().replaceAll("\\s", ""))) {
                System.out.println("Ovaj putnik vec postoji. ");
                isThere = true;
                break;
            }
        }
        if (!isThere) {
            putnici.add(putnik);
        }
    }
    public void ukloniPutnika(Putnik putnik){
        boolean isThere = false;
        if (putnici.size() == 0) {
            System.out.println("Autobus je prazan.");
        } else {
            for (int i = 0; i < putnici.size(); i++) {
                if (putnici.get(i).getIme_I_prezime().toLowerCase().replaceAll("\\s", "").
                        equals(putnik.getIme_I_prezime())) {
                    isThere = true;
                    putnici.remove(putnik);
                    break;
                }
            }
        }
        if (!isThere) {
            System.out.println("Takav putnik ne postoji. ");
        }
    }
    public void dodajVozaca(Vozac vozac){
        if (Autobus.vozac!=null){
            System.out.println("Vozac autobusa vec postoji.");
        }else  Autobus.vozac = vozac;
    }
    public void ukloniVozaca() {
        if (vozac != null) {
            vozac = null;
        } else {
            System.out.println("Ne mozete ukloniti vozaca koji ne postoji.");
        }
    }

    public ArrayList<Putnik> getListaPutnika() {
        return putnici;
    }

    public boolean naplatiKartu(Putnik putnik) {
        if (cenaKarte > 0 && vozac != null) {
            putnik.skiniNovac(cenaKarte);
            return true;
        } else {
            System.out.println("Karta se moze naplatiti kada je vozac" +
                    "u autobusu i kada je cena karte pravilno uneta");
            return false;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<putnici.size();i++ ){
            if (i!= putnici.size()-1){
                sb.append(putnici.get(i).toString()).append(",").append("\n");
            }else sb.append(putnici.get(i).toString());

        }
        return naziv + " ( " + vozac.getIme_I_prezime()+" - "+"\n"+ sb+")";
    }
}
