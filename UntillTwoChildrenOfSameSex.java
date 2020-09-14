public class UntillTwoChildrenOfSameSex {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 0;

        while (heads != 2 && tails != 2) {
            double flip = Math.random();
            count++;
            if (flip < 0.5) {
                heads++;
                System.out.println("HEADS " + heads);
            } else {
                tails++;
                System.out.println("TAILS " + tails);
            }
        }
        System.out.println("You should have " + count + " children in order to have 2 children same sex");

    }
}
