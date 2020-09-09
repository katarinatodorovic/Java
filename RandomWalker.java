public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int distance = 0;
        int steps = 0;
        int x = 0;
        int y = 0;
        System.out.println("(" + x + ", " + y + ")");
        while (distance != r) {

            double k = Math.random();
            if (k < 0.25) x--;
            else if (k < 0.50) x++;
            else if (k < 0.75) y--;
            else if (k < 1.00) y++;
            steps++;

            distance = Math.abs(x) + Math.abs(y);
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps =  " + steps);

    }
}
