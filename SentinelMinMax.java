/*Write a ConsoleProgram that reads in a list of integers, one per line, until a sentinel
value of 0 (which you should be able to change easily to some other value). When the
sentinel is read, your program should display the smallest and largest values in the
list, as illustrated in this sample run.

Your program should handle the following special cases:
• If the user enters only one value before the sentinel, the program should report
that value as both the largest and smallest.
• If the user enters the sentinel on the very first input line, then no values have been
entered, and your program should display a message to that effect.
*/


import java.util.Scanner;

public class SentinelMinMax {
    public static final int SENTINEL = 0;

    public static void main(String[] args) {

        Scanner enteredNumber = new Scanner(System.in);
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        int count = 0;
        while (true) {
            System.out.println("Enter next integer: ");
            int newValue = enteredNumber.nextInt();
            count++;

            if (newValue == SENTINEL) {
                if (count == 1) {
                    System.out.println("No values have been entered! A program STOPPED working! ");
                    break;
                }
                break;
            }

            if (newValue > tempMin) {
                tempMin = newValue;
            }
            if (newValue < tempMax) {
                tempMax = newValue;
            }

        }

        if (count > 1) {
            System.out.println("Max number is:  " + tempMax);
            System.out.println("Min number is:  " + tempMin);
        }

    }
}

