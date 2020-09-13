import java.util.Scanner;

public class HowManyDigitInNumberAreDivisableBy3 {
    public static void main(String[] args) {

        /*Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.
B) Modifikovati program tako da se postupak pod a) ponavlja i to tako da pre svakog unosa korisnik vidi
pitanje da li želi da unese još jedan broj. Ako je odgovor 'da' treba izbrojati cifre deljive sa 3, a ukoliko je 'ne'
treba završiti program.
C) Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive.*/

        Scanner sc = new Scanner(System.in);
        Scanner ns = new Scanner(System.in);
        String processContinue;
        int number;
        int remainder;
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Enter a number:");
            number = sc.nextInt();
            while (number != 0) {
                remainder = number % 10;
                number = number / 10;
                if (remainder % 3 == 0) {
                    count++;
                    sum++;
                }
            }

            String singular = count == 1 ? "is" : "are";
            String plural = count == 1 ? "number" : "numbers";
            System.out.printf("There %s %d %s divisible by 3.%n", singular, sum, plural);

            System.out.println("Do you want to enter a new number? Write Yes/No.");
            processContinue = ns.nextLine().toLowerCase();
            if (processContinue.equals("yes")) {
                sum = 0;
                continue;
            }

            if (processContinue.equals("no")) {
                System.out.println("You are exited from the program.");
                break;
            }
        }
        String singular = count == 1 ? "is" : "are";
        String plural = count == 1 ? "number" : "numbers";
        System.out.printf("There %s %d %s divisible by 3 in total.%n", singular, count, plural);
    }
}
