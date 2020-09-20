

public class CMYKtoRGB {

    public static void main(String[] args) {

        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);

        double white = 1 - K;
        int red = (int) Math.round(255 * white * (1 - C));
        int green = (int) Math.round(255 * white * (1 - M));
        int blue = (int) Math.round(255 * white * (1 - Y));

        System.out.println("Red   = " + red);
        System.out.println("Green = " + green);
        System.out.println("Blue  = " + blue);

    }
}




