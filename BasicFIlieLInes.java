package novipak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicFIlieLInes {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan;
        int numOfSentences;
        String filename = args[0];
        String messageFromFile;
        if (args.length != 1) {
            System.exit(1);
        }

        scan = new Scanner(new File(filename));
        numOfSentences = Integer.parseInt(scan.next());
        for (int i = 0; i <= numOfSentences; i++) {
            messageFromFile = scan.nextLine();
            System.out.println(messageFromFile);
        }

    }
}
