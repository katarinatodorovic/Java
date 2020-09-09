import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.nextLine();
        int newNumber = Integer.parseInt(number);
        int remainder = 0;


        for (int i = 0; i < number.length(); i++) {
            remainder += newNumber % 10;
            newNumber /= 10;

        }
        System.out.println("Sum of digits is: " + remainder);
    }
}

