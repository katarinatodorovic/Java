import java.util.Scanner;

public class HailstoneSequenceEvenOddWithMetod {
    public static final int SENTINEL = 1;

    private static void Hailstone() {
        Scanner broj = new Scanner(System.in);
        System.out.println("Unesi neki broj ");
        int unetiBroj = broj.nextInt();

        int count = 0;

        while (unetiBroj != SENTINEL) {
            if (unetiBroj % 2 == 0) {
                System.out.println(unetiBroj + " je paran, uzimam pola: " + unetiBroj / 2);
                unetiBroj /= 2;
            }
            //if(unetiBroj%2==1)pravilo mi je beskonacnu petlju!!!!!!!!! jer je uvekj tako neki uslov bio ispunjen
            else {
                System.out.println(unetiBroj + "je neparan, mnozim ga sa 3 i dodajem 1 " + (unetiBroj * 3 + 1));
                unetiBroj = unetiBroj * 3 + 1;
            }
            count++;
            System.out.println("Da bi se doslo do 1, potrebno je  " + count + " koraka.");
        }
    }

    public static void main(String[] args) {
        Hailstone();
    }
}
