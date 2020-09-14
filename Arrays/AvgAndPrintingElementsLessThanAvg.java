package nizovi;

import java.util.Scanner;

public class AvgAndPrintingElementsLessThanAvg {
    public static void main(String[] args) {
        /*	Učitati članove niza. Izračunati i ispisati aritmetičku sredinu onih
        clanova niza koji su manji od aritmeticke sredine svih članova niza.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        System.out.println("Unesite elemente niza: ");
        int suma = 0;
        int sumaManjih = 0;
        double arsSvih;
        double arsManjih;
        int brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
            suma += niz[i];
        }
        arsSvih = suma * 1.0 / niz.length;
        System.out.println("ARS svih: " + arsSvih);
        for (int j = 0; j < niz.length; j++) {
            if (niz[j] < arsSvih) {
                sumaManjih += niz[j];
                brojac++;
            }
        }
        arsManjih = sumaManjih * 1.0 / brojac;
        System.out.println("ARS manjih od ars svih: " + arsManjih);


    }
}
