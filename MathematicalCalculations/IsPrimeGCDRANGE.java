public class IsPrimeGCDRANGE {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = Integer.parseInt(args[1]);
        boolean isPrime = false;
        int detectorFalse = 0;

        for (int i = 2; i < count; i++) {
            if ((gcd(n, i) == 1)) {
                if (detectorFalse <= count - 2) {
                    detectorFalse++;
                    isPrimeFermat = true;
                }
            } else {
                detectorFalse++;
                if (detectorFalse > 0) {
                    isPrimeFermat = false;
                    detectorFalse++;
                }
            }
        }
        System.out.println("Input number is  PRIME!" + isPrime);
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

