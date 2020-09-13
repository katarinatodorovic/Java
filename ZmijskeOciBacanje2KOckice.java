public class ZmijskeOciBacanje2KOckice {
    private static final int BROJ_STRANA_KOCKE = 6;

    public static void main(String[] args) {
        int broj_Kockica = 2;
        //int obaKeca = 2; ovo bi moglo da se uzmeni da treba npr da se bace dok se ne dobiju 2 sestice
        int brojPokusaja = 0;

        while (true) {
            int zbirBacenihKockica = bacajKockice(broj_Kockica);
            brojPokusaja++;

            if (zbirBacenihKockica == 2) {
                break;
            } else {
                System.out.println("Dobila si: " + zbirBacenihKockica);
            }
        }
        System.out.println("Dobila si zmijske oci posle " + brojPokusaja + " bacanja");
    }

    private static int bacajKockice(int brojKockica) {
        int total = 0;
        for (int i = 0; i < brojKockica; i++) {

            total += (int) (BROJ_STRANA_KOCKE * Math.random() + 1);
        }
        return total;

    }
}
