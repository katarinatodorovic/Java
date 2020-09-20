import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of element in Fibonacci sequence: ");
        int count = sc.nextInt();
        int[] arr = new int[count];

        int initial = 0;
        int seed = 1;
        int sum = seed + initial;

        for (int i = 0; i < count; i++) {
            arr[i] = initial;
            initial = sum - initial;
            sum += initial;
        }
        System.out.println(Arrays.toString(arr));
    }
}

