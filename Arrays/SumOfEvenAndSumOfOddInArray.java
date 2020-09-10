package nizovi;

import java.util.Scanner;

public class SumOfEvenAndSumOfOddInArray {
    public static void main(String[] args) {

        /*Učitati članove niza. Izračunati i ispisati sumu
        parnih i neparnih članova niza odvojeno.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of element in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an element: ");

        int sumEven = 0, sumOdd = 0;
        int countEven = 0, countOdd = 0;
        double avgEven, avgOdd;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
                countEven++;
            } else {
                sumOdd += arr[i];
                countOdd++;
            }
        }
        avgEven = 1.0 * sumEven / countEven;
        avgOdd = 1.0 * sumOdd / countOdd;
        System.out.println("Sum of even number is: " + sumEven);
        System.out.println("Sum of odd number is: " + sumOdd);
        System.out.println("The average of all even number is: " + avgEven);
        System.out.println("The average of all odd number is: " + avgOdd);
    }
}
