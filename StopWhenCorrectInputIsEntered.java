import java.util.Scanner;

public class StopWhenCorrectInputIsEntered {
    private static final int HotSpotSentinelConstant = 0;

    public static void main(String[] args) {
        int total = 0;
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = s.nextInt();
            if (num == HotSpotSentinelConstant) break;
            total += num;
        }
        System.out.println("The total is: " + total);
    }
}
