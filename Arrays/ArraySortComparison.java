package nizovi.arraySort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortComparison {

    public static void main(String[] args) {


        System.out.println("Enter number of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        inputArray(arr);
        arrSortDesc(arr);
        System.out.println("Array sort in descending order: " + Arrays.toString(arr));
        arrSortAsc(arr);
        System.out.println("Array sort in ascending order: " + Arrays.toString(arr));

    }

    public static Scanner sc = new Scanner(System.in);

    public static void inputArray(int[] array) {
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static void arrSortDesc(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void arrSortAsc(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
