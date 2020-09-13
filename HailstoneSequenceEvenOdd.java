/*Write a ConsoleProgram that reads in a number from the user and then displays the
Hailstone sequence for that number, just as in Hofstadter’s book, followed by a line
showing the number of steps taken to reach 1.

 Pick some positive integer and call it n.
If n is even, divide it by two.
If n is odd, multiply it by three and add one.
Continue this process until n is equal to one.

The fascinating thing about this problem is that no one has yet been able to prove that
it always stops. The number of steps in the process can certainly get very large. How
many steps, for example, does your program take when n is 27?

*/


import java.util.Scanner;

public class HailstoneSequenceEvenOdd {

    public static final int HOFSTADTER = 1;

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Unesi neki broj: ");
        int unetiBroj = n.nextInt();

        int count = 0;
        while (unetiBroj != HOFSTADTER) {
            if (unetiBroj % 2 == 0) {
                System.out.println(unetiBroj + " je paran, uzimam pola: " + unetiBroj / 2);
                unetiBroj /= 2;
            } else {
                System.out.println(unetiBroj + " je neparan, obradujem ga 3n + 1: " + (unetiBroj * 3 + 1));
                unetiBroj = unetiBroj * 3 + 1;
            }
            count++;
        }
        System.out.println("Da se izvrsi proces potrebno je " + count + " koraka" + " da bi se doslo do 1");
    }
}


