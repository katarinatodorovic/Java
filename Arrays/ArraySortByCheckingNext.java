package nizovi.arraySort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortByCheckingNext {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr);

        arrSortAscNext(arr);
        System.out.println("Array sort by checking next element " +
                "in ascending order:  " + Arrays.toString(arr));

        arrSortDescNext(arr);
        System.out.println("Array sort by checking next element " +
                "in desc order:  " + Arrays.toString(arr));


    }

    public static void inputArray(int[] array) {
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void arrSortAscNext(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j < array.length - 1; j++) {
                if (array[i] > array[j + 1]) {
                    temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

    }

    public static void arrSortDescNext(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j < array.length - 1; j++) {
                if (array[i] < array[j + 1]) {
                    temp = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

    }
}
