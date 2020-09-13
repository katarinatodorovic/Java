package proba;

class Lik {
    public void govori(String predstavise) {
        System.out.println(predstavise);
    }

    public void kreni(String pravac, double daljina) {
        System.out.println("Idem  " + daljina + " metara " + pravac);
    }

    public void skoci(int visina) {
        System.out.println("Skacem: " + visina + " metra");
    }

}

public class ParametriMetoda {
    public static void main(String[] args) {

        Lik mario = new Lik();
        mario.govori("Cao, ja sam Mario, tvoj novi lik u igrioci!");
        mario.kreni("pravo", 12.2);
        mario.skoci(2);

        String porukaZaIgraca = "Pazi kuda skaces imaju skrivena blaga.";
        mario.govori(porukaZaIgraca);

        String plivanje = " samo pravo!";
        double staza = 7.5;
        mario.kreni(plivanje, staza);

        int skoci = 2;
        mario.skoci(skoci);


    }
}
