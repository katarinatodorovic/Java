public class NumbersInRangeDivisableBy3 {
    public static void main(String[] args) {


        int count = 0;

        for (int i = 9; i <= 250; i++) {
            if (i % 3 == 0) {
                count++;
                System.out.println("Divisable by 3 is: " + i);
            }
        }
        System.out.println(count);
    }
}
