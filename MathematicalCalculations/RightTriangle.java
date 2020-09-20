public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle;

        isRightTriangle = (a > 0 && b > 0 && c > 0);

        isRightTriangle = isRightTriangle && (a * a + b * b == c * c ||
                                              b * b + c * c == a * a ||
                                              a * a + c * c == b * b);

        System.out.println(isRightTriangle);
    }

}
