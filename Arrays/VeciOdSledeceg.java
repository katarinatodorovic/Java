package nizovi;

import java.util.Scanner;

public class VeciOdSledeceg {
    public static void main(String[] args) {
        /*	Učitati članove niza. Ispisati: članove niza koji su veći od slijedećeg člana.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenataniza:");
        int n = sc.nextInt();
        int[] brojevi = new int[n];
        System.out.println("Unesite elemenate niza:");

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = sc.nextInt() + 1;
        }
        System.out.print("(");
        for (int value : brojevi) {

            if (value != brojevi[brojevi.length - 1]) {
                System.out.print(value + " * ");

            } else {
                System.out.print(brojevi[brojevi.length - 1]);
            }
        }
        System.out.print(")");
        //System.out.println(Arrays.toString(brojevi));
    }
}
