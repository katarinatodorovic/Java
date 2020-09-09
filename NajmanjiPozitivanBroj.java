//1.	Tražiti od korisnika da unese pozitivan broj N.
// Zatim uèitavati N brojeva sa standardnog ulaza i
// ispisati vrednost najmanjeg unetog broja.


import java.util.Scanner;

public class NajmanjiPozitivanBroj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite INICIJALNI broj: ");
        int n = scanner.nextInt();
        int provera = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int c = scanner.nextInt();
            if (c < provera) {
                provera = c;
            }

        }
        System.out.println("NAJMANJI: " + provera);
    }
}
