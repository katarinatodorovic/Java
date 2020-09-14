package igrica;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean isRightP1 = false;
        boolean isRightP2 = false;
        boolean isRightP3 = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Im thinking about nuimber between 0 and 9 ...");

        while (true) {
            System.out.println("Number to guess is  " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);
            if (guessp1 == targetNumber) {
                isRightP1 = true;
            }
            if (guessp2 == targetNumber) {
                isRightP2 = true;
            }
            if (guessp3 == targetNumber) {
                isRightP3 = true;
            }

            if (isRightP1 || isRightP2 || isRightP3) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + isRightP1);
                System.out.println("Player two got it right? " + isRightP2);
                System.out.println("Player three got it right? " + isRightP3);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
