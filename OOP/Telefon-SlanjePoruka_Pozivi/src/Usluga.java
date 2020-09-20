package Telefon2.src;

/*
Услуга се ствара задавањем броја телефона који је иницирао услугу и броја телефона
коме је услуга упућена. Могуће је дохватити целобројну цену услуге. Текстуални опис услуге је
облика broj_od -> broj_ka.
* */
public abstract class Usluga {

    private Broj kojiIniciraUslug;
    private Broj komeJeUslugaUpucena;
    private static double cenaUsluge;

    public Usluga(Broj kojiIniciraUslug, Broj komeJeUslugaUpucena) {
        this.kojiIniciraUslug = kojiIniciraUslug;
        this.komeJeUslugaUpucena = komeJeUslugaUpucena;
    }

    public static double getCenaUsluge() {
        return cenaUsluge;
    }

    public Broj getKojiIniciraUslug() {
        return kojiIniciraUslug;
    }

    public Broj getKomeJeUslugaUpucena() {
        return komeJeUslugaUpucena;
    }

    public abstract double tipUsluge(Usluga u);


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(kojiIniciraUslug).append("_").append("od -> ").append(komeJeUslugaUpucena).append("_ka"));
    }
}
