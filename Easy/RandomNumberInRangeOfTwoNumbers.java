
public class RandomNumberInRangeOfTwoNumbers {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int r = min + (int) (Math.random() * (max - min));

        System.out.println(r);
    }

}