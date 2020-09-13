import java.util.Scanner;

public class SumAllDigitsInNumberUntilOneDigit {
    public static void main(String[] args) {
        /*Zadat je nenegativan broj. Sabirati njegove cifre
         sve dok rezultat ne bude samo jedna cifra. Ispisati je.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int remainder;
        int sum = 0;
        int newSum = 0;
        int singleDigitNumber;
        if (number < 0) {
            System.exit(1);
        }
        while (number != 0) {
            remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }

        if (sum < 10) {
            System.out.println("The sum of digits in entered number is: " + sum);
        } else {
            while (sum != 0) {
                singleDigitNumber = sum % 10;
                newSum += singleDigitNumber;
                sum = sum / 10;

            }
            if (newSum == 10) {
                System.out.println("The sum of digits in entered number is: " + 1);
                System.exit(1);
            }
            System.out.println("The sum of digits in entered number is: " + newSum);
        }
    }
}
