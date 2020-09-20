/*Alice tosses a fair coin until she sees two consecutive heads.
Bob tosses another fair coin until he sees a head followed by a tail.
 Write a program to estimate the probability that
  Alice will make fewer tosses than Bob?*/

public class AliceAndBob {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int alice = 0;
        int bob = 0;
        int nobody = 0;

        for (int i = 1; i <= trials; i++) {
            int heads = 0;
            int tails = 0;
            System.out.println("\nTRIALS " + i + ":");
            double r = Math.random();
            if (r < 0.5) {
                heads++;
                System.out.println("\nHead ");
                r = Math.random();
                if (r < 0.5) {
                    heads++;
                    alice++;
                    System.out.println("ANOTHER head- Alice wins");
                } else {
                    tails++;
                    nobody++;
                    System.out.println("Tail- Nobody win");
                }
            } else {
                tails++;
                System.out.println("\nTail ");
                r = Math.random();
                if (r < 0.5) {
                    heads++;
                    bob++;
                    System.out.println("Head- Bob win");
                } else {
                    tails++;
                    nobody++;
                    System.out.println("ANOTHER Tail- Nobody win");
                }
            }
        }
        System.out.println("\nAlice Wins: " + alice);
        System.out.println("Bob wins: " + bob);
        System.out.println("Nobody wins: " + nobody);
    }
}
