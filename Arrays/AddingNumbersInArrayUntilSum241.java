package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class AddingNumbersInArrayUntilSum241 {
    public static void main(String[] args) {
        /*Sabirati članove niza sve dok je suma manja od 241. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in array:");
        int numOfElements = sc.nextInt();
        int[] arr = new int[numOfElements];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (100 - 1)) + 1);
        }
        int j = 0;
        while (j < arr.length && sum + arr[j] < 241) {
            sum += arr[j];
            j++;
        }
        System.out.println("Sum before 241: " + sum);
        System.out.println(Arrays.toString(arr));
    }
}


