import java.util.Scanner;

public class NthDayInYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the date for which you want to do the check,%n" +
                "(separate date numbers with space day month year like: 15 1 1998):%n ");
        String input[] = sc.nextLine().split(" ");
        int day = 0;
        int month = 0;
        int year = 0;
        boolean isPositive = day < 0 && month < 0 && year < 0;

        try {
            day = Integer.parseInt(input[0]);
            month = Integer.parseInt(input[1]);
            year = Integer.parseInt(input[2]);

        } catch (Exception e) {
            System.out.println("Invalid input");
            isPositive = true;
            System.out.println("Every number in date must be greater than 0");
            System.exit(1);

        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};


        if (month > 2 && year % 4 == 0 &&
                (year % 100 != 0 || year % 400 == 0)) {
            ++day;
        }

        for (int i = 0; i < month - 1; i++) {
            day += daysInMonth[i];
        }
        System.out.println("It is " + day + " day in year.");
    }
}
