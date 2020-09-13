import java.util.Scanner;

public class IsNumberPowOf3 {

    public static void main(String[] args) {

        /*Za zadati ceo broj odrediti da li je on stepen broja 3.*/

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isCube = false;

        for (int i = 1; i * i * i <= num; i++) {
            if (i * i * i == num) {
                isCube = true;
                System.out.println("Cube root of the given number is " + i);
            }
        }
        String s = isCube ? "is" : "is not";
        System.out.printf("The number %d %s power of the number 3.%n", num, s);
    }
}
