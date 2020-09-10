import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingAndAddingIntegersFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String filename;
        Scanner in;
        int a, b, count, i;

        if (args.length != 1) {
            System.exit(1);
        }

        filename = args[0];
        in = new Scanner(new File(filename));
        count = Integer.parseInt(in.nextLine());
        i = 0;
        while (i < count) {
            a = Integer.parseInt(in.nextLine());
            b = Integer.parseInt(in.nextLine());
            System.out.println(String.format("The sum of %d and %d is %d.", a, b, a + b));
            i++;
        }


    }
}
