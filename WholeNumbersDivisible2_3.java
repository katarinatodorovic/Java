/*To test program enter one number greater than 0 and program will
 * print every number in range from 0-N if is divisible by both 2 and 3*/

import java.util.Scanner;

public class WholeNumbersDivisible2_3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println("The number divisible with both 2 and 3 is: " + i);
                } else {
                    System.out.format("The number %d is not divisible by 2 nor 3.%n", i);
                }
            }
        } else {
            System.out.println("The entered number must be grater than 0.");
        }

    }
}
