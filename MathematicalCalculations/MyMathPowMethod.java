public class MyMathPowMethod {
    public static void main(String[] args) {

        System.out.println(modPow(10, 23, 10));
    }

    public static long modPow(int base, int exponent, int mod) {
        long pow = 1;
        for (int i = 0; i < exponent; i++) {
            pow *=base;
        }
        System.out.println(pow);
        return ((pow - base) % mod);
    }
}
