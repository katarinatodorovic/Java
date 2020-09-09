import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAndWritingFromFile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/myname/Desktop/dummyText.txt");
        Scanner sc = new Scanner(file);

        StringBuilder bilder = new StringBuilder();
        while (sc.hasNextLine()) {
            bilder.append(sc.nextLine()).append("\n");
        }

        FileWriter writer = new FileWriter("C:/Users/myname/Desktop/Novi Teskt Od Starog.txt");
        writer.write(String.valueOf(bilder));
        writer.close();
    }
}
