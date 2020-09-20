import java.util.Scanner;

/*Program counting non positive integers and output their sum*/
public class SumCountNonPositiveInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int brojac = 0;
        int sum = 0;

        while (true) {
            System.out.println("Enter non positive integer: ");
            int x = sc.nextInt();
            if (x > 0) {
                break;
            }
            if (x < 0) {
                brojac++;
                sum += x;
            }
        }
        System.out.println("You entered : " + brojac + " non positive integers and their sum is: " + sum + ".");
    }
}

