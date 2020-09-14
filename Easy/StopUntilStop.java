/* Korisnik unosi reci sve dok ne unese rec "stop".
Nakon toga treba ispisati sve prethodno unete reci.
Napomena: stringovi se porede koristeci  equals
str1.equals(str2)
rezultat true ako su jednaki, false ako nisu
*/

import java.util.Scanner;

public class StopUntilStop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite string:");
        String unosKorisnika = sc.nextLine().toLowerCase();
        String zbir = " ";

        while (!unosKorisnika.equals("stop")) {
            zbir = unosKorisnika + " " + zbir;
            System.out.println("Unesite string:");
            unosKorisnika = sc.nextLine();
        }
        System.out.println(zbir);
    }
}
