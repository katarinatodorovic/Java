/*Program takes one argument - name of the month. If all 3 names are typed in correctly,
 * program will calculate sum of days in entered months. Otherwise, program will
 * brake when wrong name is entered and output will be sum of previously typed names correctly.
 * The names of the month are not case sensitive and april is same as APriL */


import java.util.Scanner;

public class MonthName3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String month;
        int sum = 0;
        int day;
        for (int i = 0; i < 3; i++) {
            System.out.println("Input name of the month: ");
            month = sc.nextLine().toLowerCase();
            if (month.equals("january") || month.equals("february") ||
                    month.equals("march") || month.equals("april") ||
                    month.equals("may") || month.equals("june") ||
                    month.equals("july") || month.equals("august") ||
                    month.equals("september") || month.equals("october") ||
                    month.equals("november") || month.equals("december")) {
                switch (month) {
                    case "january":
                    case "march":
                    case "may":
                    case "july":
                    case "august":
                    case "october":
                    case "december":
                        System.out.println("Chosen month has 31 days.");
                        day = 31;
                        sum += day;
                        break;
                    case "february":
                        System.out.println("Chosen month has 28 days.");
                        day = 28;
                        sum += day;
                        break;
                    case "april":
                    case "june":
                    case "september":
                    case "november":
                        day = 30;
                        sum += day;
                        System.out.println("Chosen month has 30 days.");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Input month not found.");
                break;
            }

        }
        System.out.println("Sum of days in chosen months is: " + sum);
    }
}
