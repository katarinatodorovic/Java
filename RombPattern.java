import java.util.Scanner;

public class RombPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite visinu romba: ");
        int visinaRomba = scanner.nextInt();

        if (visinaRomba % 2 == 0) {
            visinaRomba += 1;
        }
        for (int red = 0; red <= visinaRomba / 2; red++) {
            for (int i = 0; i <= visinaRomba - red; i++)
                System.out.print(" ");
            for (int i = 0; i <= red * 2; i++)
                System.out.print("*");
            System.out.println();
        }

        for (int red = visinaRomba / 2; red > 0; red--) {
            for (int i = visinaRomba - red + 2; i > 0; i--)
                System.out.print(" ");
            for (int i = red * 2; i > 1; i--)
                System.out.print("*");
            System.out.println();
        }

    }
}
