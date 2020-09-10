/*To test program enter two number greater than 0. If sum of two numbers
 * are les or equal than 10 program will sum those numbers. If not, program
 * will multiply two entered numbers*/


import java.util.Scanner;

public class MultiplicationAndAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = sc.nextInt();
        System.out.println("Enter second number: ");
        int m = sc.nextInt();
        int addition = n + m;
        int multiplication = n * m;

        if (n > 0 && m > 0) {
            if (addition <= 10) {
                System.out.println("Sum of entered numbers is: " + addition);
            } else {
                System.out.println("Multiplication of entered numbers is:  " + multiplication);
            }
        } else {
            System.out.println("Please enter the numbers that are greater than 0.");
        }
    }

}

