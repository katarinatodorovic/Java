import java.util.Arrays;
import java.util.Scanner;

/*Sorting 10 entered integers in array and finding max number*/

public class ArraySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element in array: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                max = arr[0];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest number in array is:  " + max);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
