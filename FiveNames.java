/*
* Text file "names" need to be created.
* Text file content:
5
Radoje
Miloje
Sredoje
Stanoje
Vukoje
*
* Text file path need to be created and inserted in edit configuration
* as first argument, and one name as other argument. Second argument is
* not case sensitive miloje, miLOje will bi same as Miloje
*and output result will be match
*
* */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FiveNames {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 2) {
            System.exit(1);
        }
        String namesFile = args[0];
        String nameInput = args[1];
        String nameInFile;
        Scanner scanner = new Scanner(new File(namesFile));

        int count = Integer.parseInt(scanner.next());
        int numOfLetterInName = nameInput.length();
        int detectorFalse = 0;
        int detectorTrue = 0;
        for (; count + 1 > 0; count--) {
            nameInFile = scanner.nextLine();
            if (nameInFile.equalsIgnoreCase(nameInput)) {
                detectorTrue++;
                if (detectorTrue > 0) {
                    System.out.format("Input name is: %s, and it has %d letter in it.", nameInFile, numOfLetterInName);
                }
            }
            if (!nameInFile.equalsIgnoreCase(nameInput)) {
                detectorFalse++;
                if (detectorFalse == 6) {
                    System.out.println("Input name is not in the file");
                }
            }
        }
    }
}
