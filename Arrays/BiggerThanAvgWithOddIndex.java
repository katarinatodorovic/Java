package nizovi;

import java.util.Scanner;

public class BiggerThanAvgWithOddIndex  {
    public static void main(String[] args) {
        /*Učitati članove niza. Izračunati aritmetičku sredinu i ispisati
        sumu članova niza većih od aritmetičke sredine sa neparnim indeksom.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenataniza:");
        int n = sc.nextInt();
        int[] brojevi = new int[n];
        System.out.println("Unesite elemenate niza:");
        int suma = 0;
        int sumVeciOdArs = 0;
        double ars;
        int brojac = 0;

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = sc.nextInt();
            suma += brojevi[i];
            if (i % 2 != 0) {
                sumVeciOdArs += brojevi[i];
                brojac++;
            }
        }

        ars = suma * 1.0 / brojevi.length;
        System.out.println("Ukupna ars je: " + ars);
        double arsNemarnih = sumVeciOdArs * 1.0 / brojac;
        System.out.println("Ars neparnih je : " + arsNemarnih);
        int sumaNearVeciOdArsNepar = 0;

        System.out.println("Ars svih elemenata niza " + ars);
        for (int k = 0; k < brojevi.length; k++) {
            if (brojevi[k] > arsNemarnih && k % 2 != 0) {
                sumaNearVeciOdArsNepar += brojevi[k];
            }
        }
        System.out.println("Sima veca od ars " + sumaNearVeciOdArsNepar);
    }
}
