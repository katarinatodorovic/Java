/*Program trazi da uneses broj kockica koje bacas i
da ih bacas sve dok ne dobijes sve sestice*/

import java.util.Scanner;

public class RollingDiceUntil6 {
    private static final int BROJ_STRANA_KOCKE = 6;                                                                     //konstante se definisu van metoda da bi bile dostupne i ako se koriste van glavnog metoda

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                                                                             //za unos broja kockica koje bacamo
        System.out.println("Unesi broj kockica koje zelis da bacis: ");
        int broj_Kockica = s.nextInt();
        int sve_SesticeNaKockicama = broj_Kockica * BROJ_STRANA_KOCKE;                                                  //koji broj treba da dobijem pr ako bacam 3 kockice znaci 3 * 6
        int brojPokusaja = 0;                                                                                           //def van da bi mi uopste bilo dostupno da se napise koliko sam puta bacila

        while (true) {
            int zbirBacenihKockica = bacajKockice(broj_Kockica);                                                        //bacaj je isto sto i total dole ; prosledjuje funkciji dole kao argument br kockica koje smo uneli npr unela sam 3
            brojPokusaja++;                                                                                             //ovaj samo belezi 1 po jedan a onaj gore dodaje 1+1+1+1 i zato je izvan definisan

            if (zbirBacenihKockica == sve_SesticeNaKockicama) {
                break;
            } else {
                System.out.println("Dobila si: " + zbirBacenihKockica);
            }
        }
        System.out.println("Dobila si: " + sve_SesticeNaKockicama
                + " posle " + brojPokusaja + " bacanja");
    }

    private static int bacajKockice(int brojKockica) {                                                                  //zove se isto kao varijabla gore ali nije ista
        int total = 0;
        for (int i = 0; i < brojKockica; i++) {                                                                         // ako sam prosledila kao argument br 3 baca svaku od 3 kockuice po 1 i rezultat belezi u total dok ne dobije 3 * 6
            // Random ran = new Random();
            // ran.nextInt(BROJ_STRANA_KOCKE - 1 + 1) + 1;
            total += (int) (BROJ_STRANA_KOCKE * Math.random() + 1);                                         // generise random broj izmedju 1 i 6 i to sabira u total
        }
        return total;                                                                                                   //total ide u bacaj kao rezultat
    }

}
