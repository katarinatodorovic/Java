public class FibonaciMaxTermValue {

    public static void main(String[] args) {

        int f0 = 0;
        int f1 = 1;
        int sum = 0;
        final int MAX_TERM_VALUE = 10000;
        System.out.println(f0);
        while (sum < MAX_TERM_VALUE) {
            System.out.println(f1);
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
        }
    }
}
