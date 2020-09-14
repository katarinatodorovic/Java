package zadatak;

public class Trougao extends Figura {
    private double a;
    private double b;
    private double c;

    public Trougao(String naziv, String boja, double a, double b, double c) {
        super(naziv, boja);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double obim() {
        double obim = a + b + c;
        return obim;
    }
}
