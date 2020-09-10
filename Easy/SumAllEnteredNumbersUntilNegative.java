/*Korisnik treba da unosi brojeve sve dok ne
unese negativan broj. Kada unese negativan broj
treba ispisati zbir svih prethodno unetih brojeva
i prekinuti program.
 */

package avgustsesti;

import java.util.Scanner;

public class SumAllEnteredNumbersUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int sum = 0;
        int unosBaroja = sc.nextInt();

        while (unosBaroja >= 0) {
            sum += unosBaroja;
            System.out.println("Enter a number: ");
            unosBaroja = sc.nextInt();
        }
        System.out.println("Sum is: " + sum);
    }
}
