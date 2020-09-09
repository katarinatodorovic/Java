import java.util.Arrays;
import java.util.Scanner;

public class PolovinaNiza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter even number:");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("You didn't entered even number.");
            System.exit(1);
        }

        int[] a = new int[n];
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            System.out.println("Enter the element in the array:");
            a[j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i = a.length / 2; i < a.length; i++) {
            sum += a[i];
        }
        int average = sum / (n / 2);
        System.out.printf("Sum of elements in the second half of array is: %d, " +
                "and average is: %d", sum, average);
    }
}
