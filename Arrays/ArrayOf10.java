import java.util.Scanner;

public class ArrayOf10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = 10;
        int[] years = new int[limit];
        int below18 = 0;
        int range18_50 = 0;
        
        for (int i = 0; i < limit; i++) {
            System.out.println("Enter age:");
            years[i] = sc.nextInt();
            if (years[i] < 0) {
                System.out.println("The age must be over 0. Enter last number again.");
                i--;
                continue;
            }
            if (years[i] < 18) {
                below18++;
            }
            if (years[i] > 18 && years[i] < 50) {
                range18_50++;
            }
        }
        System.out.printf("Hera are %d people that are younger than 18%n" +
                "and %d people in range between 18 and 50", below18, range18_50);

    }
}
