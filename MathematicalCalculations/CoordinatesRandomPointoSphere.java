public class CoordinatesRandomPointoSphere {

    public static void main(String[] args) {
        double a, b;
        do {
            a = 2.0 * Math.random() - 1.0;
            b = 2.0 * Math.random() - 1.0;
        } while (a * a + b * b > 1.0);

        System.out.println("(" + a + "," + b + ")");

        double discriminantxy = 1 - a * a - b * b;
        double x = 2 * a * Math.sqrt(discriminantxy);
        double y = 2 * b * Math.sqrt(discriminantxy);
        double z = 1 - 2 * (a * a + b * b);

        System.out.println("(" + x + "," + y + "," + z + ")");

    }
}
