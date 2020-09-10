package nizovi;

import java.util.Scanner;

public class MultiplyUntil541 {
    public static void main(String[] args) {

        /*Množiti članove niza sve dok je proizvod manji od 541. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in array:");
        int numOfElements = sc.nextInt();
        int[] arr = new int[numOfElements];
        int product = 1;

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        while (j < arr.length && product * arr[j] < 541) {
            product *= arr[j];
            j++;
        }
        System.out.println("Product is: " + product);
    }
}
