public class CanRandomTwoNumbersFormTriangleInputTrials {
    public static void main(String[] args) {

        int trials = Integer.parseInt(args[0]);
        int y = 0;
        int n = 0;

        for (int i = 1; i <= trials; i++) {

            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);
            int c = (int) (Math.random() * 10);

            if (a + b > c && a + c > b && b + c > a) {
                y++;
                System.out.println(a + ", " + b + ", " + c + " can form the side length of a triangle ");
            } else {
                n++;
            }
        }
        System.out.println("Number of posibilitis that can form triangle is: " + y + ", out of: " + trials);
        System.out.println("Number of posibilitis that can NOT form triangle is: " + n + ", out of: " + trials);
        double posto = ((double) (y * 100) / trials);
        System.out.println("Probability of forming a triangle is: " + posto + " %" + " out of: " + trials);
    }
}
