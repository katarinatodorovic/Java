public class RGBtoHSV {

    public static void main(String[] args) {

        double R = Double.parseDouble(args[0]);
        double G = Double.parseDouble(args[1]);
        double B = Double.parseDouble(args[2]);

        double newR = R / 255;
        double newG = G / 255;
        double newB = B / 255;

        double min = Math.min(Math.min(newR, newG), newB);
        double max = Math.max(Math.max(newR, newG), newB);
        double brightness = max * 100;
        double delta = max - min;

        double hue;
        if (max == min) {
            hue = 0;
            System.out.println("Hue(H) is : 0 degree");
        } else if (delta == 0) {

            System.out.println("Hue is undefined");

        } else if (max == newR) {
            hue = (60 * ((newG - newB) / delta) + 360) % 360;
            System.out.println("Hue(H) is : " + Math.round(hue * 10) / 10.0);
        } else if (max == newG) {
            hue = (60 * ((newB - newR) / delta) + 120) % 360;
            System.out.println("Hue(H) is : " + Math.round(hue * 10) / 10.0);
        } else if (max == newB) {
            hue = (60 * ((newR - newG) / delta) + 240) % 360;
            System.out.println("Hue(H) is : " + Math.round(hue * 10) / 10.0);
        }

        double saturation;

        if (brightness == 0) {
            System.out.println("Saturation(S) is: 0 %");
        } else {
            saturation = (delta / max) * 100;
            System.out.println("Saturation(S) is: " + Math.round(saturation * 100) / 100.0 + "%");
        }

        System.out.println("Brightness(V) is: " + Math.round(brightness * 100) / 100.0 + "%");

    }
}
