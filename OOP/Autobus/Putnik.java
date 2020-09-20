public class Putnik extends Covek{
    /*
     * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
     * novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
     * se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
     */
    private double novac;


    public Putnik(String imeIPrezime, double novac) {
        super(imeIPrezime);
        if (novac>0){
            this.novac = novac;
        }else System.out.printf("Inicijalna suma mora biti veca od nule.");

    }


    public boolean dodajNovac(double uplati) {
        if (uplati > 0) {
            novac += uplati;
            return true;
        } else {
            System.out.println("Morate uplatiti vise od 0 dinara");
            return false;
        }

    }

    public boolean skiniNovac(double skiniNovacSaRacuna) {
        if (skiniNovacSaRacuna <= novac && skiniNovacSaRacuna > 0) {
            novac -= skiniNovacSaRacuna;
            return true;

        } else {
            System.out.println("Nemate dovoljno novca na racunu!");
            return false;

        }
    }

    @Override
    public String toString() {
        return super.toString()+ " ["+ this.novac+"]";
    }
}
