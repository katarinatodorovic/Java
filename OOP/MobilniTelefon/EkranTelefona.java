public class EkranTelefona {
    private double sirinaEkrana, visinaEkrana;

    public double getSirinaEkrana() {
        return sirinaEkrana;
    }

    public double getVisinaEkrana() {
        return visinaEkrana;
    }

    public EkranTelefona(double sirinaEkrana, double visinaEkrana) {
        this.sirinaEkrana = sirinaEkrana;
        this.visinaEkrana = visinaEkrana;
    }

    public double getDuzinaDijagonale() {
        return Math.sqrt(Math.pow(this.sirinaEkrana, 2.0) + Math.pow(this.visinaEkrana, 2.0));
    }

    public static void zameniMesta(EkranTelefona a, EkranTelefona b) {
        double temp = a.sirinaEkrana;
        a.sirinaEkrana = b.sirinaEkrana;
        b.sirinaEkrana = temp;

        temp = a.visinaEkrana;
        a.visinaEkrana = b.visinaEkrana;
        b.visinaEkrana = temp;
    }
}
