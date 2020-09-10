import java.util.Scanner;

public class SumOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;
        int n = 0;
        String month;
        System.out.println("Input a name of three months. Use only lower case letters.");
        for (i = 0; i < 3; i++) {
            month = sc.nextLine();
            switch (month) {
                case "january":
                case "march":
                case "may":
                case "july":
                case "august":
                case "october":
                case "december":
                    n = 31;
                    sum += n;
                    break;

                case "february":
                    n = 28;
                    sum += n;
                    break;

                case "april":
                case "june":
                case "september":
                case "november":
                    n = 30;
                    sum += n;
                    break;

                default:
                    System.out.println("You have entered invalid month name.");
                    break;
            }
            System.out.println("Sum of number of days in those months is " + sum);
        }
    }
}
