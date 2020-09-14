package nizovi;

import java.util.Scanner;

public class DivisableByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenataniza:");
        int n = sc.nextInt();
        int[] brojevi = new int[n];
        System.out.println("Unesite elemenate niza:");

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = sc.nextInt();
        }

        for (int j = 0; j < brojevi.length; j++) {
            if (brojevi[j] % 2 == 0) {
                System.out.println(brojevi[j]);
            }
        }
    }
}
