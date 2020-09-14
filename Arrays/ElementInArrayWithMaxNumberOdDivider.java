/*stvara niz od 1 do n elemenata
STAMPA! niz od 1 do n elemenata
treba mi da izvrsim poredjenje -> MIN_VALUE
* petlja koja vrti svaki pojedinacni element niza
 * kako bi proverila sa kojim je sve brojevima deljiv
 petlja koja vrti svaki pojedinacni element niza
   kako bi proverila sa kojim je sve brojevima deljiv
 treba mi neki brojac da vidim koji je to najveci broj delilaca
   i kada naidje na neki u ifu onda skonta- aha deljiv je pribelezi tj
  stavi recku!
  i krece od 1 jer je to prvi element niza
             * ali ne ide dalje od j  za 3 ne deli ga sa brojem vecim od 3
             * znaci deli broj sa samim sobom kao najvecim
             * za pr br 5 proveraca sve brojeve od 1 do 5 sa kojim je sve deljiv*/
/*ovde recka kada naidje na delilac
 * ovde belezi koji je to najveci br delilaca koji ima neki element niza-privremeniNajmanji
 * i koji je to broj j-brojNizaSaNajviseDelilaca*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ElementInArrayWithMaxNumberOdDivider {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi za koliko elemenata niza zelis da proveris delioce: ");
        int a = scanner.nextInt();
        int[] niz;

        niz = IntStream.range(1, a + 1).toArray();
        System.out.println("Niz za obradu je:   " + Arrays.toString(niz));

        int privremenoNajveci = Integer.MIN_VALUE;
        int brojNizaSaNajviseDelilaca = 0;


        for (int j = 1; j < niz.length; j++) {
            int brojac = 0;

            for (int i = 1; i <= j; i++) {
                if (j % i == 0 && i <= j) {
                    brojac++;
                }
            }

            if (brojac > privremenoNajveci) {
                privremenoNajveci = brojac;
                brojNizaSaNajviseDelilaca = j;

            }
        }
        System.out.println("Najveci broj delilaca za neki elemenat niza je:  " + privremenoNajveci
                + " i to za broj " + brojNizaSaNajviseDelilaca);
    }
}
