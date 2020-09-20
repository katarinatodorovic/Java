import java.util.Scanner;

public class FibRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite boj: ");
        int t = sc.nextInt();
        fibN(t);

    }

    public static int fibN(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return n;
        } else {
            return (fibN(n - 1) + fibN(n - 2));
        }
    }
}
