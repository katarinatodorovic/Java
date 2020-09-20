/*
long testNumber = (long) (Math.pow(a, n-1));
if ((testNumber - a) % n == 0) {
            isPrimeFermat = true;
}*/


public class IsPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long maxRange = n - 2;
        int count = Integer.parseInt(args[1]);
        int a = (int) ((Math.random() * (maxRange - 2)) + 2);
        boolean isPrimeFermat;
        long testNumber = (long) (Math.pow(a, n - 1));
        long x = testNumber - 1;

        for (int i = 0; i < count; i++) {
            if ((n % 2 != 0) && (n % a != 0) && (gcd(n, a) == 1)) {

                if (x)
                    isPrimeFermat = true;
                System.out.println("Input number is PRIME!" + isPrimeFermat);
            } else {
                System.out.println("Input number is not prime, try another one.");
            }
        }
    }

    public static int gcd(int n, int a) {
        int gcd = 1;
        for (int i = 1; i <= n && i <= a; i++) {
            if (n % i == 0 && a % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

