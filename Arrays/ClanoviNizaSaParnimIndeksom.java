package nizovi;

import java.util.Scanner;

public class ClanoviNizaSaParnimIndeksom {
    public static void main(String[] args) {
        /*	Učitati članove niza. Ispisati članove niza sa parnim indeksom.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenataniza:");
        int n = sc.nextInt();
        int[] brojevi = new int[n];
        System.out.println("Unesite elemenate niza:");

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = sc.nextInt();
        }
        for (int j : brojevi) {
            if (j % 2 == 0) {
                System.out.println(brojevi[j]);
            }
        }

    }
}
