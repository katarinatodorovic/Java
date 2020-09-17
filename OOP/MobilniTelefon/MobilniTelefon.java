public class MobilniTelefon {
    private String proizvodjac, model;
    private int godinaProizvodnje, kolicinaRAMa, kolicinaSkladista;
    private EkranTelefona ekran;


    public String getProizvodjac() {
        return proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public double getKolicinaRAM() {
        return kolicinaRAMa;
    }

    public double getKolicinaSkladista() {
        return kolicinaSkladista;
    }

    public EkranTelefona getEkran() {
        return ekran;
    }

    public MobilniTelefon(String proizvodjac, String model,
                          int godinaProizvodnje, int kolicinaRAMa,
                          int kolicinaSkladista, EkranTelefona ekran) {
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kolicinaRAMa = kolicinaRAMa;
        this.kolicinaSkladista = kolicinaSkladista;
        this.ekran = ekran;
    }

    public double ocenaPodobnosti() {
        if (ekran.getDuzinaDijagonale() < 5.0) {
            return ekran.getDuzinaDijagonale() * kolicinaRAMa /
                    (2020 - godinaProizvodnje);
        } else return ekran.getDuzinaDijagonale() * kolicinaSkladista /
                (2020 - godinaProizvodnje);

    }

    public static void zameniMesto(MobilniTelefon a, MobilniTelefon b) {
        EkranTelefona.zameniMesta(a.ekran, b.ekran);

        String tempS = a.proizvodjac;
        a.proizvodjac = b.proizvodjac;
        b.proizvodjac = tempS;

        tempS = a.model;
        a.model = b.model;
        b.model = tempS;

        int tempI = a.godinaProizvodnje;
        a.godinaProizvodnje = b.godinaProizvodnje;
        b.godinaProizvodnje = tempI;

        tempI = a.kolicinaRAMa;
        a.kolicinaRAMa = b.kolicinaRAMa;
        b.kolicinaRAMa = tempI;

        tempI = a.kolicinaSkladista;
        a.kolicinaSkladista = b.kolicinaSkladista;
        b.kolicinaSkladista = tempI;


    }

    @Override
    public String toString() {
        String zaPrikaz = "";
        zaPrikaz += String.format
                ("%-24s%-17s%-20s%-19s\n",
                        "Proizvodjac:", proizvodjac,
                        "Model:", model);
        zaPrikaz += String.format("%-24s%13d    %-20s%16.2f PP\n",
                "Godina proizvodnje:", godinaProizvodnje,
                "Ocena podobnosti:", ocenaPodobnosti());
        zaPrikaz += String.format("%-24s%5.2f x %5.2f in %-20s%16.2f in\n",
                "Sirina i visina ekrana:",
                ekran.getSirinaEkrana(),
                ekran.getVisinaEkrana(),
                "Dijagonala ekrana:",
                ekran.getDuzinaDijagonale());
        zaPrikaz += String.format("%-24s%13.2f MB %-20s%16.2f MB\n",
                "Kolicina RAM memorije:",
                kolicinaRAMa / (1024. * 1024.),
                "Kolicina skladista:",
                kolicinaSkladista / (1024. * 1024.));
        return zaPrikaz;
    }
}
