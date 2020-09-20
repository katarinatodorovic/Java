import java.util.Scanner;

public class MinMaxOF3And4Numbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter number 3: ");
        int c = sc.nextInt();
        System.out.println("Enter number 4: ");
        int d = sc.nextInt();
        System.out.println("Enter double to cast into int: ");
        double e = sc.nextDouble();

        System.out.println("Max of first two number is: "+returnMax(a,b));
        System.out.println("Min of second two number is: "+returnMin(c,d));
        System.out.println("Min of three number is " +returnMin3(c,d,returnCast(e)));
        System.out.println("Max of three number is: "+ returnMax3(a,b,c));
        System.out.println("Min of four number is: "+returnMin4(returnCast(e),a,b,c));
        System.out.println("Enter four number to see max: ");
        int max = returnMax4(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Max number is: " + max);


    }

    public static int returnMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static int returnCast(double a) {
        return (int) a;
    }

    public static int returnMin(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static int returnMax3(int a, int b, int c) {

        return returnMax(returnMax(a, b), c);
    }

    public static int returnMin3(int a, int b, int c) {

        return returnMin(returnMin(a, b), c);
    }

    public static int returnMax4(int a, int b, int c, int d) {

        return returnMax(returnMax(a, b),returnMax(c, d));
    }

    public static int returnMin4(int a, int b, int c, int d) {

        return returnMin(returnMin(a, b), returnMin(c, d));
    }

    public static boolean isFirstLessThanSecond(int a, int b) {
        if (a < b) return true;
        else return false;

    }
}
