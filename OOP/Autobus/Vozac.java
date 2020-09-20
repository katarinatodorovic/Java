public class Vozac extends Covek {
    /*
     * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
     */

    private String zanimanje;

    public Vozac(String imeIPrezime) {
        super(imeIPrezime);
        this.zanimanje = "sofer";
    }

    @Override
    public String toString() {
        return "Vozac [ " + super.toString() + " " + ", zanimanje -> " + zanimanje + " ] ";
    }
}
