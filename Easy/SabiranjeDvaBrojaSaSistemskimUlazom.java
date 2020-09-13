/*File SabiranjeDvaBrojaSaSistemskimUlazom.java*/

import java.util.Scanner;

public class SabiranjeDvaBrojaSaSistemskimUlazom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi sabirak: ");
        int prviSabirak = s.nextInt();
        System.out.print("Unesite drugi sabirak: ");
        int drugiSabirak = s.nextInt();
        int zbir = prviSabirak + drugiSabirak;
        System.out.println("Zbir je:" + zbir);
    }
}

