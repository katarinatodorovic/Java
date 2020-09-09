import java.util.Scanner;

/*Program adding first two numbers and multiplying second two, and checking if result is even or odd number*/
public class AdditionMultiplicationEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Enter forth number: ");
        int d = sc.nextInt();


        if (a > 0 && b > 0 && c > 0 && d > 0) {
            int multiplication = a * b;
            int addition = c + d;

            boolean isEven = multiplication % 2 == 0;
            System.out.println("Multiplication of first two numbers is: "
                    + multiplication + ", number is even: " + isEven);

            boolean isOdd = addition % 2 == 0;
            System.out.println("Sum of second two numbers is: "
                    + addition + " and that number is even: " + isOdd);
        } else {
            System.out.println("Please enter a number greater than 0.");
        }

    }
}
