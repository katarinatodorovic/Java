
public class QuarterbackRating {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double e = Double.parseDouble(args[4]);

        double m = 475 / 12;

        double w = 250.0 / 3.0 * ((a / b) - 0.3);
        if (w <= 0 || w > m) {
            if (w < 0) {
                w = 0;
            } else if (w > m) {
                w = m;
            }

        }

        double x = (25.0 / 6.0) * ((c / b) - 3.0);
        if (x <= 0 || x > m) {
            if (x < 0) {
                x = 0;
            } else if (x > m) {
                x = m;
            }
        }

        double y = 1000.0 / 3.0 * (d / b);
        if (y <= 0 || y > m) {
            if (y < 0) {
                y = 0;
            } else if (y > m) {
                y = m;
            }
        }

        double z = 1250.0 / 3.0 * (0.095 - (e / b));
        if (z <= 0 || z > m) {
            if (z < 0) {
                z = 0;
            } else if (z > m) {
                z = m;
            }
        }
        double sum = w + x + y + z;
        System.out.printf("%.1f", sum);
    }
}

