public class TimeOfDay {

    public static void main(String[] args) {


        for (int i = 1; i <= 24; i++) {

            if (i > 0 && i < 12) {
                System.out.println(i + "am");
            } else if (i == 12) {
                System.out.println(i + " noon");
            } else if (i > 12 && i < 24) {
                System.out.println((i - 12) + "pm");
            } else {
                System.out.println("12 midnight");
            }

        }
    }
}
