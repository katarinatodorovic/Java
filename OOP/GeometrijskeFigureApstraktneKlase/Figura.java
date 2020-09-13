package zadatak;

public abstract class Figura {
    private String naziv;
    private String boja;


    public Figura(String naziv, String boja) {
        this.naziv = naziv;
        this.boja = boja;
    }

    public abstract double obim();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
}
