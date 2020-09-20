public class Collatz 
/*If n is even, then n = n / 2. If n is odd, then n = 3*n + 1*/
    public static void main(String[] args) {
        collatz();
    }

    private static void collatz() {
        int n = 20;
        int i = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                n = (n / 2);
            } else {
                n = (3 * n + 1);
            }
            i++;
        }
        System.out.println(i);
    }
}

