package definisanjeklasagetterasettera;

public class DefinisanjeKlasaGetteraSettera {
    public static void main(String[] args) {

        Vektor v1 = new Vektor(4, 4);//pravljenje objekta klase vektor
        Vektor v2 = new Vektor(3, 3);//poziva se konstruktor koji trazi argumente

        Vektor v3 = new Vektor(v1);

        v3.saberi(v2);//bio je (7,7)
        v3.skaliraj(2.0); //skalirali smo ga tj mnozili sa 2 i dobili (14,14)
        v3.oduzmi(v1);//oduzeli v1 tj po 4 od 14 i dobili (10,10)

        System.out.println("V1 = " + v1);
        System.out.println("V2 = " + v2);
        System.out.println("V3 = " + v3);

        System.out.println("V3 intenzitet " + v3.intezitet());
    }
}

