public class TwoDArrayRandomFill {
    public static void main(String[] args) {
        int[][] randFill = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                randFill[i][j] = (int) (Math.random() * 10);
                System.out.println(randFill[i][j]);
            }
            System.out.println("****************");
        }
    }
}
