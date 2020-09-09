import java.util.Scanner;

public class SumOfDigitInNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        char c;
        int a;
        int sum = 0;


        for (int i = 0; i < number.length(); i++) {
            c = nextLine.charAt(i);
            a = Character.getNumericValue(c);
            sum += a;
        }
        System.out.println("Sum of digits in number is: " + sum);
    }
}
