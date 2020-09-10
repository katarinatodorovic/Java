import java.util.Scanner;

public class ProsecnaPlata {
    public static void main(String[] args) {
        /*Napisati program u programskom jeziku java koji:
	-  Od korisnika trazi da unosi mesecne plate koje je zaradio u prethodnih 7
	   meseci.
	- Racuna i ispise prosek primanja, kao i najmanju platu.
     *Za resavanje ovog zadatka koristiti for petlju*/

        Scanner sc = new Scanner(System.in);
        double plata;
        double ukupnaPlata = 0;
        double tempMin = 10;

        for (int i = 0; i < 7; i++) {
            System.out.println("Unesite platu: ");
            plata = sc.nextDouble();
            if (plata < 0) {
                System.out.println("Plata mora biti pozitivan broj.");
                i--;
                continue;
            }
            ukupnaPlata += plata;
            if (i == 0) {
                tempMin = plata;
            }
            if (plata < tempMin) {
                tempMin = plata;
            }

        }
        double prosecnaPlata = ukupnaPlata / 7;
        System.out.printf("Prosek primanja je: %.2f %n", prosecnaPlata);
        System.out.println("Najmanja plata je: " + tempMin);

    }
}
