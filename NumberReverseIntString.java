public class NumberReverseIntString {
    public static void main(String[] args) {

        int M = 987654321;
        String s = "";
        while (M != 0) {
            int digit = M % 10;
            s = s + digit;
            M = M / 10;
            System.out.println("s: " + s + ", M: " + M);
        }
    }
}




