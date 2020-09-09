/*To test program enter two positive integers */

import java.util.Scanner;

public class AdditionAndMultiplicationOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int addition;
        int sum = 0;

//while m and n are positive integers add those two numbers and add that number to sum
        while (true) {
            System.out.println("Enter first number: ");
            n = sc.nextInt();
            System.out.println("Enter second number: ");
            m = sc.nextInt();
            if (m < 0 || n < 0) {
                System.out.println("The program can not be executed for given parameters.");
                break;
            }
            addition = n + m;
            sum += addition;
            System.out.format("Sum of number %d and %d is: %d %n", n, m, addition);
        }

        System.out.format("Sum of numbers is: %d %n", sum);

//sum all numbers in range from min to max number, min and max are
// last entered pair of numbers when previous while loop break

        int sumOfDigitsUntilMaxValue = 0;
        //Get max of that two ex -8 25
        int maxValue = Math.max(n, m);
        int minValue = Math.min(n, m);
        for (int i = minValue; i <= maxValue; i++) {
            sumOfDigitsUntilMaxValue += i;
        }

        System.out.format("Sum of number in range from minimum %d to maximum %d is: %d%n", minValue, maxValue, sumOfDigitsUntilMaxValue);
//it will loop while multiplication is greater than sum of two entered numbers
        
        while (true) {
            System.out.println("Enter first number: ");
            n = sc.nextInt();
            System.out.println("Enter second number: ");
            m = sc.nextInt();
            if (n * m < n + m) {
                System.out.format("Multiplication of number %d and %d is: %d%n", n, m, n * m);
                break;
            }
            System.out.format("Multiplication of number %d and %d is: %d%n", n, m, n * m);
        }
    }
}
