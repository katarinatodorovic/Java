package definisanjeklasagetterasettera;

public class NizVektora {
    public static void main(String[] args) {

        /*pravi niz objekata od klase vektor sa 5 elemenata*/
        Vektor[] niz = new Vektor[5];
        /*definise x i y svakog elementa posebno*/
        niz[0] = new Vektor(1.0, 2.0);
        niz[1] = new Vektor(1.5, 1.5);
        niz[2] = new Vektor(2.5, -0.5);
        niz[3] = new Vektor(-1.5, 2.6);
        niz[4] = new Vektor(0.0, 1.1);


        /*i vektor suma je objekat klase vektor jer ce koristiti konstruktor
         * za sabiranje vektora*/
        Vektor sumaSvihVektoraNiza1 = new Vektor();

        /*pravi lup za sabiranje vektora tako sto svakom sledecem
         * vektoru dodaje prethodni*/
        for (int i = 0; i < niz.length; i++) {
            sumaSvihVektoraNiza1.saberi(niz[i]);
        }

        System.out.println("Suma svih vektora je: " + sumaSvihVektoraNiza1);

        Vektor[] niz2 = new Vektor[3];
        /*niz2[0] = Vektor.unosSaTastature();
        niz2[1] = Vektor.unosSaTastature();
        niz2[2] = Vektor.unosSaTastature();
        Kraca verzija ovoga je snipet koda ispod tj for loop*/

        for (int i = 0; i < niz2.length; i++) {
            niz2[i] = Vektor.unosSaTastature();
        }

        Vektor sumaSvihVektoraNiza2 = new Vektor();


        for (int i = 0; i < niz2.length; i++) {
            sumaSvihVektoraNiza2.saberi(niz2[i]);
        }

        System.out.println("Suma svih vektora je: " + sumaSvihVektoraNiza2);
        
        for (int i = 0; i < niz2.length - 1; i++) {
            for (int j = 0; j < niz2.length - 1; j++) {
                if (niz2[i].intezitet() > niz2[i + 1].intezitet()) {

                    Vektor.zameni(niz2[i], niz2[i + 1]);

                  /*  Vektor privremeni = new Vektor();
                    niz[j] = new Vektor();
                    niz[j + 1] = privremeni;

                    ovo je drugi nacin zapisa gore
                    ali posto sam napravila funkciju nema potrebe da komplikujem
                    samo pozovem funkciju*/

                }
            }
        }
        
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i] + " , intezitet " + niz2[i].intezitet());
        }
        Vektor.sort(niz2, Vektor.POREDAK.OPADAJUCI);
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i] + " , intezitet " + niz2[i].intezitet());
        }

        Vektor.sort(niz2, Vektor.POREDAK.RASTUCI);
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i] + " , intezitet " + niz2[i].intezitet());
        }
    }
}
