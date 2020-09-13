import java.util.Random;

public class RandomSeedDice {
    public static void main(String[] args) {
        int bacanjeKocke = (int) (6 * Math.random() + 1);
        System.out.println("Bacila si: " + bacanjeKocke);

        Random r = new Random();
        int n = 1;
        r.setSeed(n);
        System.out.println("Postavljanje seeda " + n);
    }
}

