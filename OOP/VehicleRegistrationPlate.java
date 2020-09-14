//BG-123-AB;  AA-000-AA
//01-2-345-6-78  i crtica se racuna kao jedan znak i mesta crtica su oznacena sa 2 i 6
//AA - 000 - AA
//slova od A-Z plus slova šđćžč na pozicijama 0,1,7,8;
// brojevi od 0-9 na pozicijama 3,4,5
// crtice na pozicijama 2,6

package metodeifunkcije;

import java.util.Scanner;

public class VehicleRegistrationPlate {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite Vasu registarsku oznaku: ");
        String registarskaOznaka = s.nextLine();
        boolean tablicaJeUredu = ispravnaRegistarskaTablica(registarskaOznaka);
        if (tablicaJeUredu) {
            System.out.println("Registarska oznaka je ispravna.");
        } else {
            System.out.println("Niste uneli ispravnu registarku oznaku, molimo unesite ponovo!");
        }
    }

    public static boolean ispravnaRegistarskaTablica(String tablica) {
        if (tablica.length() != 9) {
            return false;
        }
        if (!daLiJeDozvoljenoSlovo(tablica.charAt(0)) || !daLiJeDozvoljenoSlovo(tablica.charAt(1)) ||
                !daLiJeDozvoljenoSlovo(tablica.charAt(7)) || !daLiJeDozvoljenoSlovo(tablica.charAt(8))) {
            return false;
        }
        if (!Character.isDigit(tablica.charAt(3)) || !Character.isDigit(tablica.charAt(4)) || !Character.isDigit(tablica.charAt(5))) {
            return false;
        }
        if (tablica.charAt(2) != '-' || tablica.charAt(6) != '-') {
            return false;
        } else {
            return true;
        }
    }

    public static boolean daLiJeDozvoljenoSlovo(char slovo) {
        if (slovo == 'A' || slovo == 'B' || slovo == 'V' || slovo == 'G' || slovo == 'D' ||
                slovo == 'Đ' || slovo == 'E' || slovo == 'Ž' || slovo == 'Z' || slovo == 'I' ||
                slovo == 'J' || slovo == 'K' || slovo == 'L' || slovo == 'M' || slovo == 'N' ||
                slovo == 'O' || slovo == 'P' || slovo == 'R' || slovo == 'S' || slovo == 'T' ||
                slovo == 'Ć' || slovo == 'U' || slovo == 'F' || slovo == 'H' || slovo == 'C' ||
                slovo == 'Č' || slovo == 'Š' || slovo == 'Q' || slovo == 'W' || slovo == 'Y' || slovo == 'X') {
            return true;
        } else {
            return false;
        }
    }

}

