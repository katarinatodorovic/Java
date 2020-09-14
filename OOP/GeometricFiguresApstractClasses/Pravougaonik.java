package zadatak;

public class Pravougaonik extends Figura {

    private double a;
    private double b;

    public Pravougaonik(String naziv, String boja, double a, double b) {
        super(naziv, boja);
        this.a = a;
        this.b = b;
    }

    public double obim() {
        double obim = 2 * (a + b);
        return obim;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
