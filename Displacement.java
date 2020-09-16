
public class Displacement {
/*Displacement is defined to be the change in position of an object*/
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.78033;

        double displacement = x + v * t + (g * (t * t) / 2);

        System.out.println("Displacement: " + displacement);
    }
}
