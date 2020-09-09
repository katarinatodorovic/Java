import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number for checking greatest common divisor, " +
                "number should be separated with space: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcdByEuclidsAlgorithm(a, b));
    }

    private static int gcdByEuclidsAlgorithm(int n, int c) {
        int gcd = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && c % i == 0) {
                gcd = i;
                count++;
            }
        }
        return gcd;
    }
}


