import java.util.Scanner;

public class CountDigitsAndLettersInString {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite recenicu za analizu: ");
        String s = scanner.nextLine();
        String izbacenePraznine = s.trim().replaceAll(" ", "");

        int brojSlova = 0, brojCifara = 0;

        for (int i = 0; i < izbacenePraznine.length(); i++) {
            char znak = izbacenePraznine.charAt(i);
            System.out.printf("%3d. znak %c\n", i + 1, znak);
            if (Character.isLetter(znak))
                brojSlova++;
            if (Character.isDigit(znak))
                brojCifara++;
        }
        System.out.println("Broj slova u recenici je: " + brojSlova);
        System.out.println("Broj cifara u recenici je: " + brojCifara);

    }
}
